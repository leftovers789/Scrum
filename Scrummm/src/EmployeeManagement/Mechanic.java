package EmployeeManagement;

import BusManagement.*;
import java.util.ArrayList;
import java.util.List;

public class Mechanic extends Employee {
    
    private List<Bus> bussesToMaintain=new ArrayList<>();
    private List<Bus> bussesToFix=new ArrayList<>();
    
    public Mechanic(int age, Gender gender, String address, String cellphoneNumber, String firstName, String lastName, String middleName, String id) {
        super(age, gender, address, cellphoneNumber, firstName, lastName, middleName, id);
    }
    
    public void addBusToMaintain(Bus busToMaintain) {
        this.bussesToMaintain.add(busToMaintain);
    }
    
    public List<Bus> getBussesToMaintain() {
        return bussesToMaintain;
    }
    
    public void addBusToFix(Bus busToFix) {
        this.bussesToFix.add(busToFix);
    }
    
    public List<Bus> getBussesToFix() {
        return bussesToFix;
    }
}
