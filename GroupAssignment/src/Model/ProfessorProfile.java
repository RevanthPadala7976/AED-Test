/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author revanth
 */
public class ProfessorProfile {

    Person person;
    private double Rating;

    
    //Constractor
    
    //getter and setter for outter Class

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }
    
    
/*
    //Main Function
    public static void main(String args[]){
        Person person = new Person();
        
        person.setFirstName("Revanth");
        person.setLastName("Padala");
        person.setEmailID("revanth@gmail.com");
        person.setID("0026079796");
        person.setPosition(Person.RollType.ProfessorProfile);
        person.setUserName("Revanth7976");
        char[] password = {'R', 'E', 'V', '1', '2', '3'};
        person.setPassword(password);
        
        ProfessorProfile Kal = new ProfessorProfile();
        Kal.setPerson(person);
        Kal.setRating(4.5);
        
        //Creating Object for Inner class in Java
        ProfessorProfile.ProfessorDirectory profDir = Kal.new ProfessorDirectory();
        
        profDir.AddPerson(Kal);
        
        System.out.println("The Result of the ProfessorProfile Directory ArrayList is: ");
        profDir.Output();
        
    }
*/
}
