/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author tallenbrook
 */
public class Lecturer extends UniPeople implements ITeach {
    
    public String coursename;
    
    public Lecturer(Integer id, String name) {
        super(id, name);
    }
    
    public void setCourseWork(String course) {
        this.coursename = course;
    }
    
    public void teach() {
        System.out.println(name + " is teaching " + course.getCode() + " in room " + course.getRoom());
    }
    
    
}
