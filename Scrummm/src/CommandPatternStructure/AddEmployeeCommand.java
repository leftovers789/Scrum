/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternStructure;

import BusManagement.*;
import EmployeeManagement.*;
import LogManagement.DutyLog;
import LogManagement.ManagerActionLog;
import RegistryManagement.*;
import java.util.Date;

/**
 *
 * @author windows
 */
public class AddEmployeeCommand implements Command{
    
    private BusCompany busCompany=BusCompany.getInstance();
    private DutyLog dutyLog=DutyLog.getInstance();
    private Employee employee;
    private Date dateAdded;
    private String action;

    public AddEmployeeCommand(Employee employee, Date dateAdded) {
        this.employee = employee;
        this.dateAdded = dateAdded;
    }
    
    
    @Override
    public void execute() {
        action="Registered "+employee.getLastName()+", "+employee.getFirstName()+" "+employee.getMiddleName();
        busCompany.addEmployee(employee);
        dutyLog.addActionLog(new ManagerActionLog(employee, dateAdded, action));
    }
    
}
