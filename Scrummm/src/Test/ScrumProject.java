package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import BookingManagement.*;
import BusManagement.*;
import RegistryManagement.*;
import UI.*;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class ScrumProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Trip t = new Trip();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(t.getReferenceNumber());
//        }
//        
//        System.out.println("-------------------");
//        Booking b = new Booking();
//        System.out.println(b.getTicketNumber());
        Bus bus = new Bus("1234", BusType.ORDINARY, true, "6969", 50, null, null, "Serial number", new Date());
        BusCompany company = BusCompany.getInstance();
        company.addBus(bus);
        SearchEngine search = new SearchEngine();
        Registry reg = Registry.getInstance();
        Trip trip;
        trip = new Trip(TripStatus.READY, 1000, "Iloilo", "Batanes", bus, new Date("02/15/15 9:05"), "RE1550002", "Ungka Terminal");
        reg.addTrip(trip);

        AddTripFrame tripFrame = new AddTripFrame();
        tripFrame.show();
        Ticket.setDiscountedRate(20);
        
        ScheduleDetailsFrame sched = new ScheduleDetailsFrame();
        sched.show();
        //test
    }    
}
