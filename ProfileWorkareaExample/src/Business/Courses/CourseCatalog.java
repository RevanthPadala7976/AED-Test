/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Courses;

import Business.Person.Person;
import Business.UserAccounts.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author revanth
 */
public class CourseCatalog {
    private ArrayList<Course> courseCatalog;
    
    //Constractor

    public CourseCatalog() {
        this.courseCatalog = new ArrayList();
    }
    
    //Getter

    public ArrayList<Course> getCourseCatalog() {
        return courseCatalog;
    }
    
    
    //Adding course to the course catalog
    public Course newCourse(String courseCode, String courseName, String semester, String Id) {

        Course c = new Course(courseCode, courseName, semester, Id);
        courseCatalog.add(c);
        return c;
    }
    
    //Finding a Course
    public Course findCourse(String courseCode) {

        for (Course c : courseCatalog) {

            if (c.isMatch(courseCode)) {
                return c;
            }
        }
        return null; //not found after going through the whole list
    }
    
    /*
     * The course code must me unique
     * below is the method to check the course code already exist in the course catalog
    */
    public boolean checkCourseCode(String coursecode){
         for(Course c : courseCatalog){
             
            if (c.getCourseCode().equalsIgnoreCase(coursecode)) {
                return true;
            }
        }
         return false;
    }
}
