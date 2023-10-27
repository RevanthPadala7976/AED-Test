/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author NIKESH
 */
public class ProfessorProfile extends Profile{
    
    Person person;
    int rating;
    
    public ProfessorProfile(Person p) {
        super(p);

    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    
    
}
