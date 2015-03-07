/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternClasses;

import BusManagement.*;
import LogManagement.DutyLog;
import java.util.Date;

/**
 *
 * @author windows
 */
public class EditBusDataCommand implements Command {
    
    private BusCompany busCompany = BusCompany.getInstance();
    private Bus bus;
    private String action;
    private Date dateModified=new Date();

    public EditBusDataCommand(Bus bus) {
        this.bus = bus;
    }

    public Bus getBus() {
        return bus;
    }

    public String getAction() {
        return action;
    }

    public Date getDateModified() {
        return dateModified;
    }

    @Override
    public void execute() {
        action="Modified Bus Number: "+bus.getBusNumber()+" data";
        busCompany.getBusses().remove(bus);
        busCompany.getBusses().add(bus);
        
    }

}
