/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EmployeeManagement;

/**
 *
 * @author windows
 */
public class Cashier extends Employee{
    
    private String password;

    public Cashier(String password, int age, Gender gender, String address, String cellphoneNumber, String firstName, String lastName, String middleName, String id) {
        super(age, gender, address, cellphoneNumber, firstName, lastName, middleName, id);
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    
}
