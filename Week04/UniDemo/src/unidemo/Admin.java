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
public class Admin {
    
    public static void assignCourse(Lecturer teacher, Course course) {
        teacher.setCourse(course);
    }
    
    public static void assignCourse(Student student, Course course) {
        student.setCourse(course);
    }
    
    public static void getDetails(UniPeople person) {
        System.out.println(person.getName() + person.getId() + person.getCourse());
    }
}
