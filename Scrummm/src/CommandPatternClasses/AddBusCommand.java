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
public class AddBusCommand implements Command{
    
    private Bus bus;
    private Date dateAdded;
    private BusCompany busCompany=BusCompany.getInstance();
    private String action;

    public AddBusCommand(Bus bus) {
        this.bus = bus;
    }

    public Bus getBus() {
        return bus;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public String getAction() {
        return action;
    }
    
    @Override
    public void execute() {
        action="Added Bus Number: "+bus.getBusNumber();
        busCompany.addBus(bus);
    }
    
}
