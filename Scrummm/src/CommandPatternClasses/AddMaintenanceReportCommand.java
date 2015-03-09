/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternClasses;

import BusManagement.Bus;
import EmployeeManagement.Mechanic;
import LogManagement.MaintenanceReport;
import java.util.Date;

/**
 *
 * @author windows
 */
public class AddMaintenanceReportCommand implements Command{
    
    private Date date=new Date();
    private Mechanic mechanic;
    private String action="";
    private MaintenanceReport maintenanceReport;
    private boolean issueFixed;

    public AddMaintenanceReportCommand(Mechanic mechanic, MaintenanceReport maintenanceReport, boolean issueFixed) {
        this.mechanic = mechanic;
        this.maintenanceReport = maintenanceReport;
        this.issueFixed = issueFixed;
    }

    public Date getDate() {
        return date;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public String getAction() {
        return action;
    }

    public MaintenanceReport getMaintenanceReport() {
        return maintenanceReport;
    }

    public boolean isIssueFixed() {
        return issueFixed;
    }
    
    @Override
    public void execute() {
        Bus bus=maintenanceReport.getBus();
        for (String string : bus.getTireSerialNumbers()) {
            if (maintenanceReport.getDescriptionOfIssue().contains(string)) {
                action=action+"\n Tire Serial #:"+string+" for replacement";
            }
        }
        if (action.isEmpty()) {
            if (issueFixed && !maintenanceReport.getDescriptionOfIssue().isEmpty()) {
                action="Problem Fixed";
            } else {
                action="Problem Found";
            }
        }
        
        mechanic.addMaintenanceReport(maintenanceReport);
    }
    
}
