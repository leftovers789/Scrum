/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternClasses;

/**
 *
 * @author windows
 */
import BusManagement.*;
import EmployeeManagement.*;
import LogManagement.*;
import java.util.Date;

public class RemoveEmployeeCommand implements Command {
    
    private BusCompany busCompany = BusCompany.getInstance();
    private Employee employee;
    private String action;
    private Date dateRemoved = new Date();

    public RemoveEmployeeCommand(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getAction() {
        return action;
    }

    public Date getDateRemoved() {
        return dateRemoved;
    }

    @Override
    public void execute() {
        action = "Removed " + employee.getLastName() + ", " + employee.getFirstName() + " " + employee.getMiddleName() + " data";
        busCompany.getEmployees().remove(employee);
    }

}
