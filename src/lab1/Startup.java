/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ritu
 */
public class Startup {
    public static void main(String args[]){
        
        Course introProg = new IntroToProgrammingCourse();
        Course introJava = new IntroJavaCourse();
        Course advJava = new AdvancedJavaCourse();
        
        introProg.setCredits(3.0);
        System.out.println(introProg.getCredits());
        
        introJava.setCourseName("Introduction to Java");
        System.out.println(introJava.getCapitalizedCourseName());
        
        advJava.setCourseNumber("152-135");
        System.out.println(advJava.getCourseNumber());
        
        advJava.setPrerequisites(introJava.getCourseName());
        System.out.println(advJava.getPrerequisites());
        
    }
}
