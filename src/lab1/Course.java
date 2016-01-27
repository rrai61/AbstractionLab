package lab1;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ritu
 */
public abstract class Course {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
   
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
        
    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null or empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }
     
    public abstract void setCredits(double credits);
    
    public final String getPrerequisites() {
        return prerequisites;
    }
    
    public abstract void setPrerequisites(String prerequisites);

}
