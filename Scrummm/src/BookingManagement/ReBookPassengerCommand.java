/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookingManagement;

import EmployeeManagement.Cashier;
import LogManagement.*;
import LogManagement.DutyLog;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class ReBookPassengerCommand implements Command{
    
    private DutyLog log = DutyLog.getInstance();
    private Cashier cashier;
    private Passenger passenger;
    private Trip currentTrip;
    private Trip oldTrip;
    private String action;

    public ReBookPassengerCommand(Cashier cashier, Passenger passenger, Trip currentTrip, Trip oldTrip) {
        this.cashier = cashier;
        this.passenger = passenger;
        this.currentTrip = currentTrip;
        this.oldTrip = oldTrip;
    }
    
    @Override
    public void execute() {
        action = "Re-booked a passenger from "+oldTrip.getReferenceNo()+" to "+currentTrip.getReferenceNo();
        oldTrip.removePassenger(passenger);
        currentTrip.addPassenger(passenger);
        log.addActionLog(new CashierActionLog(passenger, action));
    }
    
}
