/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Chanky-JVM
 */
public class Student {

    public int getStudentID() {
        return StudentID;
    }
    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    public float getCGPA() {
        return CGPA;
    }
    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }    
    public Marks getMarks() {
        return Marks;
    }
   @Autowired
    public void setMarks(Marks Marks) {
        this.Marks = Marks;       
    }    
    private int StudentID;
    private String StudentName;
    private float CGPA; 
    private Marks Marks;
    
}
