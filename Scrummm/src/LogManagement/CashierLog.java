/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LogManagement;

import BookingManagement.Passenger;
import EmployeeManagement.Cashier;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class CashierLog {
    
    private Cashier cashier;
    private Passenger passenger;
    private String actionType;
    private Date date;

    public CashierLog(Cashier cashier, Passenger passenger, String actionType, Date date) {
        this.cashier = cashier;
        this.passenger = passenger;
        this.actionType = actionType;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getActionType() {
        return actionType;
    }

    public Date getDate() {
        return date;
    }
    
    
    
}
