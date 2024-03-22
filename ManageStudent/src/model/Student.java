/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HÙNG
 */
public class Student {
    
    private String sudentID;
    private String studentName;

    public Student(String sudentID, String studentName) {
        this.sudentID = sudentID;
        this.studentName = studentName;
    }

    public String getSudentID() {
        return sudentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setSudentID(String sudentID) {
        this.sudentID = sudentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "sudentID=" + sudentID + ", studentName=" + studentName + '}';
    }
    
    
    
}
