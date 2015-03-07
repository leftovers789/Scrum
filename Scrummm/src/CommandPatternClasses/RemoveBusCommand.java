/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPatternClasses;

import BusManagement.*;
import java.util.Date;

/**
 *
 * @author windows
 */
public class RemoveBusCommand implements Command{
    
    private BusCompany busCompany=BusCompany.getInstance();
    private Date dateRemoved;
    private String action;
    private Bus bus;

    public RemoveBusCommand(Bus bus) {
        this.bus = bus;
    }

    public Date getDateRemoved() {
        return dateRemoved;
    }

    public String getAction() {
        return action;
    }

    public Bus getBus() {
        return bus;
    }
    
    @Override
    public void execute() {
        action="Removed Bus Number: "+bus.getBusNumber()+" data";
        busCompany.getBusses().remove(bus);
    }
    
}
