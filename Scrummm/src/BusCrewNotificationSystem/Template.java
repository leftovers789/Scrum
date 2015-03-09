/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusCrewNotificationSystem;

import BookingManagement.Trip;
import BusManagement.Bus;
import java.text.SimpleDateFormat;

/**
 *
 * @author Sian Paul Lasaga
 */
public class Template {
    
    private SimpleDateFormat df = new SimpleDateFormat("EEE MMMM dd, YYYY hh:mm a");
    private SimpleDateFormat df1 = new SimpleDateFormat("EEE");
    
    public String getAddTripScheduleTemplate(Trip trip){
        String route = trip.getTripFrom()+" to "+trip.getTripTo();
        return "Good day. Pls. be informed that you have been scheduled in "+route+" on "+df.format(trip.getSchedule())+". Thank you.";
    }
    
    public String getSetFixedScheduleTemplate(Trip trip, Bus bus, String startMonth, String lastMonth){
        String route = trip.getTripFrom()+" to "+trip.getTripTo();
        return "Good day. Your bus "+bus.getBusNumber()+" has been set to a fixed schedule every "+df1.format(trip.getSchedule())+" of a week "
                + "starting first week of "+startMonth+" to the last week of "+lastMonth+". Route: "+route;
    }
    
    public String getCancelledTripTemplate(Trip trip){
        String route = trip.getTripFrom()+" to "+trip.getTripTo();
        return "Good day. Pls. be informed that your trip in "+route+" on "+df.format(trip.getSchedule())+" has been canceled.";
    }
    
    public String getRemovedScheduleTemplate(Trip trip){
        String route = trip.getTripFrom()+" to "+trip.getTripTo();
        return "Good day. Pls. be informed that your trip in "+route+" on "+df.format(trip.getSchedule())+" has been removed.";
    }
    
    public String getDelayedScheduleTemplate(){
        return "Good day. Pls be informed that your trip has been delayed. Pls standby to leave soon. Thank you.";
    }
    
    public String getChangeInTripInfoTemplate(Trip oldTrip, Trip newTrip){
        String oldRoute = oldTrip.getTripFrom()+" to "+oldTrip.getTripTo();
        String newRoute = newTrip.getTripFrom()+" to "+newTrip.getTripTo();
        return "Good day. Pls be informed that the trip bellow has been changed/rescheduled:\n"
                + "Bus no. "+oldTrip.getBus().getBusNumber()+" "+oldRoute+" - "+df.format(oldTrip.getSchedule()+"\n"
                        + "to\nBus no. "+newTrip.getBus().getBusNumber()+" "+newRoute+" - "+df.format(newTrip.getSchedule())+"\n"
                        + "If the bus has changed and you are a driver or conductor in the new bus, pls prepare. Thank you.");
    }
    
}
