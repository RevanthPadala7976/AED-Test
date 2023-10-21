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
public class ProfessorDirectory {
    ArrayList<ProfessorProfile> professorDirectory;
    
    //Constractor

    public ProfessorDirectory() {
        this.professorDirectory = new ArrayList<>();
    }
    
    //Getter and Setter
    //Change the getter method according to your use
    public ArrayList<ProfessorProfile> getProfessorDirectory() {
        return professorDirectory;
    }
    //Adding element to the arrayList
    public void setProfessorDirectory(ProfessorProfile professor) {
        this.professorDirectory.add(professor);
    }
    
    
    //The below method is to see the output in the netbeans window
    public void Output(){
        
        for(ProfessorProfile p : professorDirectory){
            Person person = new Person();
            person = p.getPerson();
            System.out.println("{["+person.getFirstName() + ", " + person.getLastName() +
                ", " + person.getEmailID() +"], "+ p.getRating() + "}");
            //System.out.println();
        }
        
    }
    
}
