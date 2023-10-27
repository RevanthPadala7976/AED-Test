/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Courses;

/**
 *
 * @author revanth
 */
public class Course {
    private String courseCode;
    private String courseName;
    private String semester;
    private String userID;
    
    //Constractor

    public Course(String courseCode, String courseName, String semester, String professorID) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.semester = semester;
        this.userID = professorID;
    }
    
    //getter and setter

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSemester() {
        return semester;
    }
    
    public boolean isMatch(String courseCode) {
        return getCourseCode().equals(courseCode);
    }
}
