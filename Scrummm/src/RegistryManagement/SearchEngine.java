/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistryManagement;

import BookingManagement.*;
import BusManagement.*;
import CommandPatternClasses.AddEmployeeCommand;
import CommandPatternClasses.Command;
import EmployeeManagement.*;
import LogManagement.DutyLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sian Paul Lasaga
 */
public class SearchEngine {

    private Registry reg = Registry.getInstance();
    private BusCompany busCo = BusCompany.getInstance();

    public Bus searchBusByBusNo(String busNo) {
        for (Bus bus : busCo.getBusses()) {
            if (!busNo.isEmpty() && bus.getBusNumber().equalsIgnoreCase(busNo)) {
                return bus;
            }
        }
        return null;
    }

    public Trip searchByRefNo(String refNo) {
        for (Trip trip : reg.getTrips()) {
            if (!refNo.isEmpty() && trip.getReferenceNo().equalsIgnoreCase(refNo)) {
                return trip;
            }
        }
        return null;
    }

    public List<Trip> searchAvailableTrips() {
        List<Trip> results = new ArrayList<>();
        for (Trip trip : reg.getTrips()) {
            if (trip.getCapacity() > 0) {
                results.add(trip);
            }
        }
        return results;
    }

    public List<Trip> searchAvailableTrips(String date) {
        List<Trip> results = new ArrayList<>();
        for (Trip trip : reg.getTrips()) {
            String date1 = trip.getSchedule().getMonth() + 1 + "/" + trip.getSchedule().getDate() + "/" + (trip.getSchedule().getYear() - 100);
            if (date1.equals(date)) {
                results.add(trip);
            }
        }
        return results;
    }

    public List<Passenger> searchPassengersInATrip(Trip trip) {
        List<Passenger> results = new ArrayList<>();
        for (Passenger passenger : trip.getPassenger()) {
            results.add(passenger);
        }
        return results;
    }

    public List<Trip> searchTripFromAndTo(String loc) {
        List<Trip> results = new ArrayList<>();
        for (Trip trip : reg.getTrips()) {
            if (trip.getTripFrom().contains(loc)) {
                results.add(trip);
            }
        }
        return results;
    }

    public Passenger searchPassengerByTicketNumber(Trip trip, String ticketNumber) {
        for (Passenger passenger : trip.getPassenger()) {
            if (passenger.getTicket().getTickerNumber().equalsIgnoreCase(ticketNumber)) {
                return passenger;
            }
        }
        return null;
    }

    public Employee searchEmployeeById(String id) {
        for (Employee employee : busCo.getEmployees()) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public Date searchEmployeeDateRegistered(String name) {
        for (DutyLog dutyLog : reg.getDutyLogs()) {
            for (Command command : dutyLog.getCommandLogs()) {
                AddEmployeeCommand addEmployeeCommand = (AddEmployeeCommand) command;
                if (addEmployeeCommand.getAction().equalsIgnoreCase("Registered " + name)) {
                    return addEmployeeCommand.getDateAdded();
                }
            }
        }
        return null;
    }

    public Employee searchEmployeeByName(String otherName) {
        for (Employee employee : busCo.getEmployees()) {
            String name = employee.getLastName() + "," + employee.getFirstName() + " " + employee.getMiddleName();
            if (otherName.equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }
    
}
