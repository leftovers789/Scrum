package BusManagement;

import EmployeeManagement.*;
import java.util.*;

public class Bus {

    private String plateNumber;
    private BusType busType;
    private boolean availability;
    private String busNumber;
    private int capacity;
    private Driver driver;
    private Conductor conductor;
    private List<String> tireSerialNumbers = new ArrayList<>();
    private String engineSerialNumber;
    private Date dateAdded;

    public Bus(String plateNumber, BusType busType, boolean availability, String busNumber, int capacity, Driver driver, Conductor conductor, String engineSerialNumber, Date dateAdded) {
        this.plateNumber = plateNumber;
        this.busType = busType;
        this.availability = availability;
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.driver = driver;
        this.conductor = conductor;
        this.engineSerialNumber = engineSerialNumber;
        this.dateAdded = dateAdded;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    /**
     *
     * @param plateNumber
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public BusType getBusType() {
        return this.busType;
    }

    /**
     *
     * @param type
     */
    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public boolean isAvailable() {
        return this.availability;
    }

    /**
     *
     * @param availability
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getBusNumber() {
        return this.busNumber;
    }

    /**
     *
     * @param busNumber
     */
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getEngineSerialNumber() {
        return this.engineSerialNumber;
    }

    /**
     *
     * @param engineSerialNumber
     */
    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public List<String> getTireSerialNumbers() {
        return tireSerialNumbers;
    }

    public void addTireSerialNumber(String tireSerialNumber) {
        this.tireSerialNumbers.add(tireSerialNumber);
    }

}
