/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternStructure;

import BookingManagement.Passenger;
import BookingManagement.Trip;
import EmployeeManagement.Cashier;
import LogManagement.*;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class RemovePassengerCommand implements Command{
    
    private DutyLog log = DutyLog.getInstance();
    private Cashier cashier;
    private Trip trip;
    private Passenger passenger;
    private String action = "Removed a passenger.";

    public RemovePassengerCommand(Cashier cashier, Trip trip, Passenger passenger) {
        this.cashier = cashier;
        this.trip = trip;
        this.passenger = passenger;
    }

    @Override
    public void execute() {
        trip.removePassenger(passenger);
        log.addActionLog(new CashierActionLog(passenger, action,new Date()));
    }
    
}
