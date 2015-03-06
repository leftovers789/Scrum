/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LogManagement;

import java.util.Date;
import EmployeeManagement.*;

/**
 *
 * @author windows
 */
public class ManagerActionLog extends ActionLog{
    
    private Employee employee;
    private Date date;
    private String action;

    public ManagerActionLog(Employee employee, Date date, String action) {
        this.employee = employee;
        this.date = date;
        this.action = action;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getDate() {
        return date;
    }

    public String getAction() {
        return action;
    }
    
    
}
