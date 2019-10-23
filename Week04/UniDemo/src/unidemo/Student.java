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
public class Student extends UniPeople {

    public Student(int id, String name) {
        super(id, name);
    }
    
    public void attendClass() {
        System.out.println(name + " is attending " + this.course.getCode() + " in room " + this.course.getRoom());
        
    }
    
    public void doCoursework() {
        System.out.println(name + " is doing coursework " + this.course.getCoursework());
    }
   
    
    
}
