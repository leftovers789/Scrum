/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternStructure;

/**
 *
 * @author windows
 */

import BusManagement.BusCompany;
import EmployeeManagement.*;
import LogManagement.*;
import java.util.Date;

public class RemoveEmployeeCommand implements Command{
    
    private BusCompany busCompany=BusCompany.getInstance();
    private Employee employee;
    private String action;
    private Date dateRemoved;
    private DutyLog dutyLog=DutyLog.getInstance();

    public RemoveEmployeeCommand(Employee employee, Date dateRemoved) {
        this.employee = employee;
        this.action = action;
        this.dateRemoved = dateRemoved;
    }
    
    @Override
    public void execute() {
        action="Removed "+employee.getLastName()+", "+employee.getFirstName()+" "+employee.getMiddleName()+" data";
        busCompany.getEmployees().remove(employee);
        dutyLog.addActionLog(new ManagerActionLog(employee, dateRemoved, action));
    }
    
}
