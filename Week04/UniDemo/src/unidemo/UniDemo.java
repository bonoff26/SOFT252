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
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lecturer chris = new Lecturer(10, "Chris");
        Student tom = new Student(50, "Tom");
        Course compsci = new Course();
        compsci.setCode("12");
        compsci.setRoom("SMB104");
        
        System.out.println("Student info: " + tom.getName() + tom.getId());
        Admin.assignCourse(chris, compsci);
        Admin.assignCourse(tom, compsci);
        chris.teach();
        compsci.setCoursework("some complicated stuff");
        tom.doCoursework();
        System.out.println("Lecturer info: " + chris.getName() + chris.getId());

        
    }
    
}
