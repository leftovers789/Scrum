/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import BookingManagement.Trip;
import BookingManagement.TripStatus;
import BusManagement.*;
import EmployeeManagement.*;
import LogManagement.*;
import RegistryManagement.*;
import UI.LoginFrame;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class Final {
    
    public static void main(String[] args) {
        BusCompany company = BusCompany.getInstance();
        Registry reg = Registry.getInstance();
        DutyLog dutyLog=DutyLog.getInstance();
        Cashier cashier1 =  new Cashier("cashier1", 25, Gender.FEMALE, "Iloilo", "09091199234", "Arlette", "Palsario", "P", "Id123");
        Cashier cashier2 =  new Cashier("cashier2", 26, Gender.FEMALE, "Iloilo", "09290481894", "Ruth", "Ataal", "A", "Id124");
        Driver driver1 = new Driver(30, Gender.MALE, "Jaro", "09092845911", "Stephen", "Duncara", "B", "ID122");
        Driver driver2 = new Driver(40, Gender.MALE, "Jaro", "09235739121", "Gymylh", "Labanero", "L", "ID091");
        Driver driver3 = new Driver(32, Gender.MALE, "Lapaz", "090921428401", "Rolivi", "Vilanueva", "V", "ID092");
        Conductor conductor1 = new Conductor(30, Gender.MALE, "Lapaz", "09180158321", "Karl", "Hisole", "H", "ID217");
        Conductor conductor2 = new Conductor(32, Gender.MALE, "Jaro", "09191257312", "Rego", "Padilla", "P", "ID227");
        Conductor conductor3 = new Conductor(37, Gender.MALE, "Pavia", "09277838893", "Sian", "Lasaga", "B", "ID019");
        Operator operator = new Operator("operate", 35, Gender.FEMALE, "Iloilo", "09302134711", "Kisha", "Prudente", "P", "ID291");
        Manager manager = new Manager("manager", "jamesmylabs", 18, Gender.MALE, "Japan", "09066429942", "James", "Barte", "S", "ID069");
        Mechanic mechanic1 = new Mechanic(37, Gender.MALE, "Iloilo", "09228521951", "Guy", "Villanueva", "V", "ID012"); 
        
        company.addEmployee(cashier1);
        company.addEmployee(cashier2);
        company.addEmployee(driver1);
        company.addEmployee(driver2);
        company.addEmployee(conductor1);
        company.addEmployee(conductor2);
        company.addEmployee(operator);
        company.addEmployee(manager);
        company.addEmployee(mechanic1);
    
        Bus bus1 = new Bus("EA102", BusType.ORDINARY, true, "6969", 50, driver1, conductor1, "Serial number", new Date());
        Bus bus2 = new Bus("EA104", BusType.AIR_CONDITIONED, true, "6980", 50, driver2, conductor2, "Serial number", new Date());
        Bus bus3 = new Bus("EA109", BusType.ORDINARY, true, "6920", 50, driver3, conductor3, "Serial number", new Date("01/01/15"));
        bus1.addTireSerialNumber("BK241");
        bus1.addTireSerialNumber("BK242");
        bus1.addTireSerialNumber("BK243");
        bus1.addTireSerialNumber("BK244");
        bus2.addTireSerialNumber("BK341");
        bus2.addTireSerialNumber("BK342");
        bus2.addTireSerialNumber("BK343");
        bus2.addTireSerialNumber("BK344");
        bus3.addTireSerialNumber("BK441");
        bus3.addTireSerialNumber("BK442");
        bus3.addTireSerialNumber("BK443");
        bus3.addTireSerialNumber("BK444");
//        Bus bus4 = new Bus("EA101", BusType.AIR_CONDITIONED, true, "6901", 50, null, null, "Serial number", new Date("04/19/14"));
        
        company.addBus(bus1);
        company.addBus(bus2);
        company.addBus(bus3);
//        company.addBus(bus4);
        
        Trip trip1 = new Trip(TripStatus.READY, 1500, "ILOILO", "CUBAO", bus1, new Date("03/10/15 9:05"), "RE1550031", "Tagbac Terminal");
        Trip trip2 = new Trip(TripStatus.READY, 2000, "BACOLOD", "DAVAO", bus2, new Date("03/10/15 7:30"), "RE1550032", "Ungka Terminal");
        Trip trip3 = new Trip(TripStatus.READY, 1200, "CUBAO", "ILOILO", bus1, new Date("03/13/15 8:30"), "RE1550033", "Araneta Terminal");
    
        reg.addTrip(trip1);
        reg.addTrip(trip2);
        reg.addTrip(trip3);
        
        new LoginFrame().show();
    }   
    
}
