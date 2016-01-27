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
    private String prerequisites;
   
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
        
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null or empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public abstract double getCredits();
     
    public abstract void setCredits(double credits);
    
    public String getPrerequisites() {
        return prerequisites;
    }
    
    public abstract void setPrerequisites(String prerequisites);

}
