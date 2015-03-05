/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogManagement;

import BookingManagement.Passenger;
import EmployeeManagement.Cashier;
import EmployeeManagement.Employee;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class CashierActionLog extends ActionLog{

    private Passenger passenger;
    private String actionType;

    public CashierActionLog(Passenger passenger, String actionType) {
        this.passenger = passenger;
        this.actionType = actionType;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getActionType() {
        return actionType;
    }

}
