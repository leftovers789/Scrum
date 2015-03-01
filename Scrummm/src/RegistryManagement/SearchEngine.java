/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RegistryManagement;

import BusManagement.*;
import RegistryManagement.*;
import BookingManagement.*;
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
    
    
    public Bus searchBusByBusNo(String busNo){
        for (Bus bus : busCo.getBusses()) {
            if(!busNo.isEmpty() && bus.getBusNumber().equalsIgnoreCase(busNo)){
                return bus;
            }
        }
        return null;
    }
    
    public Trip searchByRefNo(String refNo){
        for (Trip trip : reg.getTrips()) {
            if(!refNo.isEmpty() && trip.getReferenceNo().equalsIgnoreCase(refNo)){
                return trip;
            }
        }
        return null;
    }
    
    public List<Trip> searchAvailableTrips(){
        List<Trip> results = new ArrayList<>();
        for (Trip trip : reg.getTrips()) {
            if(trip.getStatus().equals(TripStatus.READY))
                results.add(trip);
        }
        return results;
    }
    
    public List<Trip> searchAvailableTrips(Date date){
        List<Trip> results = new ArrayList<>();
        for (Trip trip : reg.getTrips()) {
            Date date1 = new Date(trip.getSchedule().getMonth()+"/"+trip.getSchedule().getDay()+"/"+trip.getSchedule().getYear());
            if(trip.getStatus().equals(TripStatus.READY) && date1.equals(date) && trip.getCapacity() > 0)
                results.add(trip);
        }
        return results;
    }
    
    public List<Passenger> searchPassengersInATrip(Trip trip){
        List<Passenger> results = new ArrayList<>();
        for (Passenger passenger : trip.getPassenger()) {
            results.add(passenger);
        }
        return results;
    }
}
