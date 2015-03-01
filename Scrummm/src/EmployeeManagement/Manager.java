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
public class Manager extends Employee{
    
    private String username;
    private String password;

    public Manager(String username, String password, int age, Gender gender, String address, String cellphoneNumber, String firstName, String lastName, String middleName, String id) {
        super(age, gender, address, cellphoneNumber, firstName, lastName, middleName, id);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
