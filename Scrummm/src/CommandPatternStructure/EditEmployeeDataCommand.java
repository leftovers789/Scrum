/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternStructure;

import BusManagement.BusCompany;
import EmployeeManagement.*;
import LogManagement.*;
import java.util.Date;

/**
 *
 * @author windows
 */
public class EditEmployeeDataCommand implements Command{
    
    private BusCompany busCompany=BusCompany.getInstance();
    private Employee employee;
    private DutyLog dutyLog=DutyLog.getInstance();
    private String action;
    private Date dateModified;

    public EditEmployeeDataCommand(Employee employee, Date dateModified) {
        this.employee = employee;
        this.dateModified = dateModified;
    }
    
    @Override
    public void execute() {
        action="Modified "+employee.getLastName()+", "+employee.getFirstName()+" "+employee.getMiddleName()+" data";
        busCompany.getEmployees().remove(employee);
        busCompany.addEmployee(employee);
        dutyLog.addActionLog(new ManagerActionLog(employee, dateModified, action));
    }
    
}
