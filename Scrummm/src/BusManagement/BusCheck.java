/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusManagement;

import EmployeeManagement.Conductor;
import EmployeeManagement.Driver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author james
 */
public class BusCheck {

    private List<BusCompany> busses = new ArrayList<>();

    BusUpdate update = new BusUpdate();

    public void check() {
        for (BusCompany bus : busses) {
            for (int i = 0; i < busses.size(); i++) {
                String busNumber = bus.getBusses().get(i).getBusNumber();
                String plateNumber = bus.getBusses().get(i).getPlateNumber();
                BusType busType = bus.getBusses().get(i).getBusType();
                String engineSerialNumber = bus.getBusses().get(i).getEngineSerialNumber();
                Driver driver = bus.getBusses().get(i).getDriver();
                Conductor conductor = bus.getBusses().get(i).getConductor();
                int capacity = bus.getBusses().get(i).getCapacity();
                boolean availability = bus.getBusses().get(i).isAvailable();

                update.update(busNumber, plateNumber, availability, capacity, driver, engineSerialNumber, busType, conductor);
            }
        }
    }

}
