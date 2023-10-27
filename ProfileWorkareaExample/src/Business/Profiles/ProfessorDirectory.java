/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class ProfessorDirectory {
    ArrayList<ProfessorProfile> professorlist;

    public ProfessorDirectory() {

     professorlist = new ArrayList();

    }

    public ProfessorProfile newProfessorProfile(Person p) {

        ProfessorProfile sp = new ProfessorProfile(p);
        professorlist.add(sp);
        return sp;
    }

    public ProfessorProfile findProfessor(String id) {

        for (ProfessorProfile pp : professorlist) {

            if (pp.isMatch(id)) {
                return pp;
            }
        }
            return null; //not found after going through the whole list
    }

    public ArrayList<ProfessorProfile> getProfessorlist() {
        return professorlist;
    }
}
