/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author revanth
 */
public class UserDirectory {
    private ArrayList<UserProfile> Users;
    
    //constracture

    public UserDirectory() {
        this.Users = new ArrayList<>();
    }
    
    
    //Getter and setter
    //Change this getter to String to get the output Human readable
    public ArrayList<UserProfile> getUsers() {
        return Users;
    }

    public void setUsers(UserProfile user) {
        this.Users.add(user);
    }
    
    
}
