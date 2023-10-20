/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author revanth
 */
public class Person {
    
    //The below attributies are common for the professor and the Student
    private String FirstName;
    private String LastName;
    private String EmailID;
    private String ID;
    private RollType position;
    private String UserName;
    
    //SHOULD NOT STORE IN THE CHAR ARRAY 
    private char[] Password;
    //Roll is user to differenciate between professor and student while logging in to the system
    public enum RollType{
        Student, 
        Professor;
    }

    

    //Getter and Setter for all the attributes
    public void setPosition(RollType position) {
        this.position = position;
    }
    
    public RollType getPosition() {
        return position;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
}
