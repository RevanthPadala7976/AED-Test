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
public class StudentDirectory {
    ArrayList<Student> studentDirectory;
    
    //Constractor

    public StudentDirectory(Student student) {
        this.studentDirectory = new ArrayList<>();
    }
    
    //Getter and Setter
    //Change the getter method according to your use
    public ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }
    //Adding element to the arrayList
    public void setStudentDirectory(Student student) {
        this.studentDirectory.add(student);
    }
    
    
}
