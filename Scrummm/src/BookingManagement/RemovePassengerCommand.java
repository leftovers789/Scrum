/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookingManagement;

import EmployeeManagement.Cashier;
import LogManagement.CashierLog;
import LogManagement.DutyLog;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class RemovePassengerCommand implements Command{
    
    private DutyLog log = new DutyLog();
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
        log.addCashierLog(new CashierLog(cashier, passenger, action, new Date()));
    }
    
}
