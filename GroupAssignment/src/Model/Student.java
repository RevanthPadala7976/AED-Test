/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author revanth
 */
public class Student {
    Person person;
    //RegisteredCourse should be arraylist
    Course RegisteredCourse;
    private double GPA;
    
    //Getter and Setter

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Course getRegisteredCourse() {
        return RegisteredCourse;
    }

    public void setRegisteredCourse(Course RegisteredCourse) {
        this.RegisteredCourse = RegisteredCourse;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
}
