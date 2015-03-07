/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternClasses;

import BusManagement.*;
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
    private String action;
    private Date dateModified=new Date();

    public EditEmployeeDataCommand(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getAction() {
        return action;
    }

    public Date getDateModified() {
        return dateModified;
    }
    
    @Override
    public void execute() {
        action="Modified "+employee.getLastName()+", "+employee.getFirstName()+" "+employee.getMiddleName()+" data";
        busCompany.getEmployees().remove(employee);
        busCompany.addEmployee(employee);
    }
    
}
