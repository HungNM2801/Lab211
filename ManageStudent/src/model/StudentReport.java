/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HÙNG
 */
public class StudentReport implements Comparable<StudentReport>{
    
    private String courseName;
    private String semester;
    
    ArrayList<Student> student;

    public StudentReport(String courseName, String semester, ArrayList<Student> student) {
        this.courseName = courseName;
        this.semester = semester;
        this.student = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSemester() {
        return semester;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "StudentReport{" + "courseName=" + courseName + ", semester=" + semester + ", student=" + student + '}';
    }

    @Override
    public int compareTo(StudentReport t) {
        
        String tstudentName = t.getStudent().get(0).getStudentName();
        
        String studentName = getStudent().get(0).getStudentName();
        
        return studentName.compareTo(tstudentName);
    }
}
