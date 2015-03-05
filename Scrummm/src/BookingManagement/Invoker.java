/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookingManagement;

import EmployeeManagement.Cashier;
import EmployeeManagement.Gender;

/**
 *
 * @author Sian Paul Lasaga
 */
public class Invoker {
    
    public void addPassengerWasExecuted(Cashier cashier, Trip trip, Passenger passenger){
        Command add = new AddPassengerCommand(cashier, trip, passenger);
        add.execute();
    }
    
    public void RemovePassengerWasExecuted(Cashier cashier, Trip trip, Passenger passenger){
        Command remove = new RemovePassengerCommand(cashier, trip, passenger);
        remove.execute();
    }
    
    public void EditPassengerWasExecuted(Cashier cashier, Trip trip, Passenger passenger, String fName, String lName, int age, Gender gender, String contactNumber, String address, Ticket ticket){
        Command edit = new EditPassengerCommand(cashier, trip, passenger, fName, lName, age, gender, contactNumber, address, ticket);
        edit.execute();
    }
    
    public void ReBookPassengerWasExecuted(Cashier cashier, Passenger passenger, Trip currentTrip, Trip oldTrip){
        Command reBook = new ReBookPassengerCommand(cashier, passenger, currentTrip, oldTrip);
        reBook.execute();
    }
    
}
