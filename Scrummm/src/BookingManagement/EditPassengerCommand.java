/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookingManagement;

import EmployeeManagement.*;
import EmployeeManagement.Gender;
import LogManagement.*;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class EditPassengerCommand implements Command{
    
    private DutyLog log = DutyLog.getInstance();
    private Cashier cashier;
    private Trip trip;
    private Passenger passenger;
    private String fName;
    private String lName;
    private int age;
    private Gender gender;
    private String contactNumber;
    private String address;
    private Ticket ticket;
    private String action = "Edited a passenger's information.";

    public EditPassengerCommand(Cashier cashier, Trip trip, Passenger passenger, String fName, String lName, int age, Gender gender, String contactNumber, String address, Ticket ticket) {
        this.cashier = cashier;
        this.trip = trip;
        this.passenger = passenger;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.address = address;
        this.ticket = ticket;
    }
    
    @Override
    public void execute() { 
        passenger.setFirstName(fName);
        passenger.setLastName(lName);
        passenger.setAddress(address);
        passenger.setAge(age);
        passenger.setGender(gender);
        passenger.setContactNumber(contactNumber);
        passenger.setTicket(ticket);
        trip.removePassenger(passenger);
        trip.addPassenger(passenger);
        log.addActionLog(new CashierActionLog(passenger, action));
    }
    
}
