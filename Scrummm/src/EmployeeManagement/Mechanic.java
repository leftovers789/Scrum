package EmployeeManagement;

import BusManagement.*;
import LogManagement.*;
import java.util.ArrayList;
import java.util.List;

public class Mechanic extends Employee {

    private List<Bus> bussesForMaintenance = new ArrayList<>();
    private List<Bus> bussesForRepair = new ArrayList<>();
    private List<MaintenanceReport> maintenanceReports = new ArrayList<>();

    public Mechanic(int age, Gender gender, String address, String cellphoneNumber,
            String firstName, String lastName, String middleName, String id) {
        super(age, gender, address, cellphoneNumber, firstName, lastName, middleName, id);
    }

    public void addMaintenanceReport(MaintenanceReport maintenanceReport) {
        this.maintenanceReports.add(maintenanceReport);
    }

    public List<MaintenanceReport> getMaintenanceReports() {
        return maintenanceReports;
    }

    public void addBusForMaintenance(Bus busForMaintenance) {
        this.bussesForMaintenance.add(busForMaintenance);
    }

    public List<Bus> getBussesForMaintenance() {
        return bussesForMaintenance;
    }

    public void addBusForRepair(Bus busForRepair) {
        this.bussesForRepair.add(busForRepair);
    }

    public List<Bus> getBussesForRepair() {
        return bussesForRepair;
    }
}
