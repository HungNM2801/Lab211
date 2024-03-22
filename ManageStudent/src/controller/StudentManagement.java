/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Student;
import model.StudentReport;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class StudentManagement {
    
    Validate validate = new Validate();
    
    public void createStudent(ArrayList<StudentReport> listOfStudentReport) {
        
        ArrayList<Student> listOfStudent = new ArrayList<>();
        while (true) {
            
            System.out.println("====== Create Student ======"); 
            System.out.println("Enter studentID");
            String studentID = validate.checkStringInput();
            System.out.println("Enter studentName: ");
            String studentName = validate.checkStringInput();
            System.out.println("Enter courseName: ");
            String courseName = validate.checkStringInput();
            System.out.println("Enter semester: ");
            String semester = validate.checkStringInput();
            
            listOfStudent.add(new Student(studentID, studentName));
            
            listOfStudentReport.add(new StudentReport(courseName, semester, listOfStudent));
            
            if (listOfStudentReport.size() > 10) {
                System.out.println("Do you want to continue (Y/N)?");
                
                String userChoice = validate.checkStringInput();
                if (userChoice.equalsIgnoreCase("N")) {
                    break;
                }
            } 
        }
    }
    
    private ArrayList<StudentReport> listStudentFindByName(ArrayList<StudentReport> listOfStudentReports) {
        
        ArrayList<StudentReport> listOfStudentFindByName = new ArrayList<>();
        
        System.out.println("Enter studentName: ");
        String studentSearchName = validate.checkStringInput();
        
        for (StudentReport studentReport : listOfStudentReports) {
            
            for(Student student : studentReport.getStudent()) {
            
                if (student.getStudentName().contains(studentSearchName)) {
                    listOfStudentFindByName.add(studentReport);
                }
            }
        }
        return listOfStudentFindByName;
    }
    
    public void findAndSort(ArrayList<StudentReport> listOfStudentReport) {
        
        if(listOfStudentReport.isEmpty()) {
            System.out.println("List Empty.");
            return;
        }
        ArrayList<StudentReport> listOfStudentFindByName = listStudentFindByName(listOfStudentReport);
        
        if (listOfStudentFindByName.isEmpty()) {
            System.out.println("Student Not exist");
        } else {
            Collections.sort(listOfStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
            
            for (StudentReport studentReport : listOfStudentFindByName) {
                
                for(Student student : studentReport.getStudent()) {
                    System.out.printf("%-15s%-15s%-15s\n", student.getStudentName(), studentReport.getSemester(),studentReport.getCourseName());
                    
                }
            }
        }
    }
    
//    public void findAndSort(ArrayList<StudentReport> listOfStudentReport) {
//    if (listOfStudentReport.isEmpty()) {
//        System.out.println("List Empty.");
//        return;
//    }
//    
////    ArrayList<StudentReport> listOfStudentFindByName = listStudentFindByName(listOfStudentReport);
////    
////    if (listOfStudentFindByName.isEmpty()) {
////        System.out.println("Student Not exist");
////    } else {
////        // Sắp xếp danh sách sinh viên theo tên
////        Collections.sort(listOfStudentFindByName, new Comparator<StudentReport>() {
////            @Override
////            public int compare(StudentReport sr1, StudentReport sr2) {
////                String name1 = sr1.getStudent().get(0).getStudentName();
////                String name2 = sr2.getStudent().get(0).getStudentName();
////                return name1.compareTo(name2);
////            }
////        });
////        
////        System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
////        
////        for (StudentReport studentReport : listOfStudentFindByName) {
////            for (Student student : studentReport.getStudent()) {
////                System.out.printf("%-15s%-15s%-15s\n", student.getStudentName(), studentReport.getSemester(), studentReport.getCourseName());
////            }
////        }
////    }
////}
    
    
    
    
    
    private ArrayList<StudentReport> getListStudentReportByID(ArrayList<StudentReport> listOfStudentReports, String studentID) {
        
        ArrayList<StudentReport> getlistOfStudentReportByID = new ArrayList<>();
        
        for (StudentReport studentReport : listOfStudentReports) {
            
            for (Student student : studentReport.getStudent()) {
                if (student.getSudentID().equalsIgnoreCase(studentID)) {
                    getlistOfStudentReportByID.add(studentReport);
                }
            }
        }
        return getlistOfStudentReportByID;
    }
    
    public StudentReport getStudentByListStudentReportFound(ArrayList<StudentReport> listOfStudentFoundByID) {
        System.out.println("List student found: ");
        
        int count = 1;
        
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Number", "Student name",
                "semester", "Course Name");
        
        for (StudentReport studentReport : listOfStudentFoundByID) {
            
            for (Student student : studentReport.getStudent()) {
                System.out.printf("%-10d%-15s%-15s%-15s\n", count, student.getStudentName(), studentReport.getSemester(),studentReport.getCourseName());
                count++;
            }
        }
        System.out.println("Enter student: ");
        int choice = validate.checkIntinput();
        return listOfStudentFoundByID.get(choice - 1);
        
    }
    
    private void changeNewStudentame(ArrayList<StudentReport> listOfStudentFindByID, String studentID, String studenNewName) {
        for(StudentReport studentReport : listOfStudentFindByID) {
            
            for (Student student : studentReport.getStudent()) {
                if (student.getSudentID().equalsIgnoreCase(studentID)) {
                    student.setStudentName(studenNewName);
                }
            }
        }
    }
    
    public void UpdateOrDelete(int count, ArrayList<StudentReport> listOfStudentReport) {
        
        if(listOfStudentReport.isEmpty()) {
            System.out.println("List empty.");
            return;
        }
        System.out.println("Enter id: ");
        String studentID = validate.checkStringInput();
        ArrayList<StudentReport> listOfStudentFindByID = getListStudentReportByID(listOfStudentReport, studentID);
        
        if (listOfStudentFindByID.isEmpty()) {
            System.out.println("Student not found");
            return;
        } else {
            StudentReport studentReport = getStudentByListStudentReportFound(listOfStudentFindByID);
            System.out.println("Do you want to Update Or Delete (U/D)?");
            
            if (validate.checkInputUD()) {
                System.out.println("Enter studen name: ");
                String newStudentName = validate.checkStringInput();
                System.out.println("Enter semester: ");
                String semester = validate.checkStringInput();
                System.out.println("Enter course name: ");
                String courseName = validate.checkStringInput();
                
                changeNewStudentame(listOfStudentFindByID, studentID, newStudentName);
                studentReport.setCourseName(courseName);
                studentReport.setSemester(semester);
                System.out.println("Update Success.");
                return;

            } else {
                listOfStudentReport.remove(studentReport);
                count--;
                System.out.println("Delete Success");
                return;
            }
        }
    }
    
    public void report(ArrayList<StudentReport> listOfStudentReport) {
        if (listOfStudentReport.isEmpty()) {
            System.out.println("List empty");
        }
//        for (StudentReport studentReport : listOfStudentReport) {
//            int totalCourse = 0;
//            if ()
//            
//        }
        for(StudentReport studentReport : listOfStudentReport) {
            for(Student student : studentReport.getStudent()) {
                System.out.printf("%-15s|%-10s|%-5d\\n", student.getStudentName(),
                                studentReport.getCourseName(), 0);
            }
        }

    }
    
    import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<StudentReport> listOfStudentReports = new ArrayList<>();
//        
//        // Thêm các StudentReport vào danh sách
//        listOfStudentReports.add(new StudentReport("Java", "Nguyen Van A"));
//        listOfStudentReports.add(new StudentReport("Java", "Nguyen Van A"));
//        listOfStudentReports.add(new StudentReport(".Net", "Nguyen Van B"));
//        listOfStudentReports.add(new StudentReport("Java", "Nguyen Van B"));
//        
//        // Danh sách báo cáo cuối cùng
//        ArrayList<StudentReport> finalReports = new ArrayList<>();
//        
//        // Lặp qua danh sách StudentReport
//        for (StudentReport studentReport : listOfStudentReports) {
//            boolean found = false;
//            
//            // Tìm kiếm trong danh sách báo cáo cuối cùng
//            for (StudentReport finalReport : finalReports) {
//                // Nếu tìm thấy sinh viên và khóa học tương ứng
//                if (finalReport.getStudentName().equals(studentReport.getStudentName())
//                        && finalReport.getCourseName().equals(studentReport.getCourseName())) {
//                    // Tăng số lượng lên 1
//                    finalReport.incrementCount();
//                    found = true;
//                    break;
//                }
//            }
//            
//            // Nếu không tìm thấy, thêm báo cáo mới vào danh sách báo cáo cuối cùng
//            if (!found) {
//                finalReports.add(studentReport);
//            }
//        }
//        
//        // Hiển thị báo cáo
//        System.out.println("The report as below:");
//        for (StudentReport finalReport : finalReports) {
//            System.out.println(finalReport.getStudentName() + " | " + finalReport.getCourseName() + " | " + finalReport.getCount());
//        }
//    }
//}
    
    
    
    
}
