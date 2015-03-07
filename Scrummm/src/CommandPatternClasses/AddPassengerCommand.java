/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternClasses;

import BookingManagement.Passenger;
import BookingManagement.Trip;
import EmployeeManagement.Cashier;
import LogManagement.*;
import LogManagement.DutyLog;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class AddPassengerCommand implements Command{
    
    private Date date=new Date();
    private Cashier cashier;
    private Trip trip;
    private Passenger passenger;
    private String action = "Booked a passenger.";

    public AddPassengerCommand(Cashier cashier, Trip trip, Passenger passenger) {
        this.cashier = cashier;
        this.trip = trip;
        this.passenger = passenger;
    }

    public Date getDate() {
        return date;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Trip getTrip() {
        return trip;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getAction() {
        return action;
    }

    @Override
    public void execute() {   
        trip.addPassenger(passenger);
    }
    
}
