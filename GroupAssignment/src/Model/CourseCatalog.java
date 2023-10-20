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
public class CourseCatalog {
    ArrayList<Course> CourseList; 
    
    //Constractor

    public CourseCatalog() {
        this.CourseList = new ArrayList<>();
    }
    
    
    //Getter and Setter
    //Need to change the getter code accordingly
    public ArrayList<Course> getCourseList() {
        return CourseList;
    }
    
    //Addding Values to the ArrayList 
    public void setCourseList(Course course) {
        this.CourseList.add(course);
    }
    
}
