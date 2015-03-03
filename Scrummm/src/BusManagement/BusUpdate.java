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
public class BusUpdate {

    private List<BusCompany> busses = new ArrayList<>();

//    public void update(String busNumber, Driver driver, String plateNumber, int capacity, Conductor conductor, String engineSerialNumber, boolean availability) {
//        for (int i = 0; i < busses.getBusses().size(); i++) {
//            if (busses.getBusses().get(i).getBusNumber() == busNumber) {
//                busses.getBusses().get(i).setDriver(driver);
//                busses.getBusses().get(i).setPlateNumber(plateNumber);
//                busses.getBusses().get(i).setCapacity(capacity);
//                busses.getBusses().get(i).setConductor(conductor);
//                busses.getBusses().get(i).setEngineSerialNumber(engineSerialNumber);
//                busses.getBusses().get(i).setAvailability(availability);
//            }
//        }
//    }
    public void update(String busNumber, String plateNumber, boolean availabity,
            int capacity, Driver driver, String engineSerialNumber, BusType busType, Conductor conductor) {
        for (BusCompany bus : busses) {
            if (bus.equals(busNumber)) {
                for (int i = 0; i < busses.size(); i++) {
                    bus.getBusses().get(i).setPlateNumber(plateNumber);
                    bus.getBusses().get(i).setAvailability(availabity);
                    bus.getBusses().get(i).setCapacity(capacity);
                    bus.getBusses().get(i).setDriver(driver);
                    bus.getBusses().get(i).setEngineSerialNumber(engineSerialNumber);
                    bus.getBusses().get(i).setBusType(busType);
                    bus.getBusses().get(i).setConductor(conductor);
                }
            }
        }
    }
}
