/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternClasses;

import BookingManagement.Passenger;
import BookingManagement.Trip;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class ReBookPassengerCommand implements Command{
    
    private Date date=new Date();
    private Passenger passenger;
    private Trip currentTrip;
    private Trip oldTrip;
    private String action;

    public ReBookPassengerCommand(Passenger passenger, Trip currentTrip, Trip oldTrip) {
        this.passenger = passenger;
        this.currentTrip = currentTrip;
        this.oldTrip = oldTrip;
    }

    public Date getDate() {
        return date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Trip getCurrentTrip() {
        return currentTrip;
    }

    public Trip getOldTrip() {
        return oldTrip;
    }

    public String getAction() {
        return action;
    }
    
    @Override
    public void execute() {
        action = "Re-booked a passenger from "+oldTrip.getReferenceNo()+" to "+currentTrip.getReferenceNo();
        oldTrip.removePassenger(passenger);
        currentTrip.addPassenger(passenger);
    }
    
}
