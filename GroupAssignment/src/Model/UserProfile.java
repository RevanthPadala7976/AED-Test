/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author revanth
 */
public class UserProfile extends Person{
    private RoleType Role;
    
    private String UserName;
    
    //SHOULD NOT STORE IN THE CHAR ARRAY. Hash the Password and store it in String
    private char[] Password;
    
    //Role is used to differenciate between professor and student while logging in to the system
    public enum RoleType{
        Student, 
        Professor;
    }
    //SkillPulse ID from the Person
    private String ID;

    
    
    
    //Constracture
    public UserProfile() {
        
        //Assigning ID automatically from the Person class
        this.ID = super.getID();
    }
    
    
    //Getter and setter

    public RoleType getRole() {
        return Role;
    }

    public void setRole(RoleType Role) {
        this.Role = Role;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public char[] getPassword() {
        return Password;
    }

    public void setPassword(char[] Password) {
        this.Password = Password;
    }

    @Override
    public String getID() {
        return ID;
    }
    
}
