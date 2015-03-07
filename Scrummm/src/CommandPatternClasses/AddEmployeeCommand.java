/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternClasses;

import BusManagement.*;
import EmployeeManagement.*;
import LogManagement.DutyLog;
import java.util.Date;

/**
 *
 * @author windows
 */
public class AddEmployeeCommand implements Command{
    
    private BusCompany busCompany=BusCompany.getInstance();
    private Employee employee;
    private Date dateAdded=new Date();
    private String action;

    public AddEmployeeCommand(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public String getAction() {
        return action;
    }
    
    @Override
    public void execute() {
        action="Registered "+employee.getLastName()+", "+employee.getFirstName()+" "+employee.getMiddleName();
        busCompany.addEmployee(employee);
    }
    
}
