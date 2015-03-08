package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import BookingManagement.*;
import BusCrewNotificationSystem.Sms;
import BusManagement.*;
import EmployeeManagement.*;
import RegistryManagement.*;
import UI.*;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Sian Paul Lasaga
 */
public class ScrumProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        
        Driver driver = new Driver(30, Gender.FEMALE, "Jaro", "222", "James", "Barte", "b", "1234");
        Conductor conductor = new Conductor(30, Gender.MALE, "Jaro", "222", "Karl", "Hisole", "h", "0987");
        Bus bus = new Bus("1234", BusType.ORDINARY, true, "6969", 50, driver, conductor, "Serial number", new Date());
        BusCompany company = BusCompany.getInstance();
        company.addBus(bus);
        Registry reg = Registry.getInstance();
        Trip trip;
        trip = new Trip(TripStatus.READY, 1000, "Iloilo", "Batanes", bus, new Date("02/15/15 9:05"), "RE1550002", "Ungka Terminal");
        reg.addTrip(trip);
        Ticket.setDiscountedRate(20);
        Ticket.setMinimumAgeForHalfFare(5);
        Passenger passenger = new Passenger("Sian", "Lasaga", 18, Gender.MALE, "09090909090", "Ioloi", new Ticket("00005", TicketType.Discounted, 1000));
        trip.addPassenger(passenger);
        new AddTripFrame().show();
//        new FixedAddTripFrame().show();
        
        //test: sending sms

//        sms.sendSms("222", "Bal");
//        sms.stopService();
//        
//        ScheduleDetailsFrame sched = new ScheduleDetailsFrame();
//        sched.show();
        
//        new CashierMainFrame().show();
//        
        //test for fixed scheduling
//        System.out.println(getDate(Calendar.FRIDAY, 5, Calendar.MARCH,2015));
    }    
    
    
        //test for fixed scheduling dates
        public static Date getDate(int day, int weekNo, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE,1);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        for (int i = 0; i < 31; i++) {
            if (cal.get(Calendar.WEEK_OF_MONTH) == weekNo
                    && cal.get(Calendar.DAY_OF_WEEK) == day) {
                return cal.getTime();
            }
            cal.add(Calendar.DATE,1);
        }
        return null;
      }
        
      
}

