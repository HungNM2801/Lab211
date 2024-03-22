/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.StudentManagement;
import static gui.Menu.display;
import java.lang.reflect.Array;
import java.util.ArrayList;
import model.StudentReport;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class run {
    public static void main(String[] args) {
        
        ArrayList<StudentReport> listOfStudentReport = new ArrayList<>();
        
        Validate validate = new Validate();
        StudentManagement manageStudent = new StudentManagement();
        
        
        int userInput = 0;
        
      while (userInput != 5) {
          
          display();
          
          userInput = validate.checkIntinput();
          
          
          switch (userInput) {
              case 1:
                  
                  manageStudent.createStudent(listOfStudentReport);
                  break;
                  
              case 2:
                  
                  manageStudent.findAndSort(listOfStudentReport);
                  break;
                  
              case 3:
                  
                  manageStudent.UpdateOrDelete(listOfStudentReport.size(), listOfStudentReport);
                  break;
                  
              case 4:
                  manageStudent.report(listOfStudentReport);
                  break;
              case 5:
                  System.out.println("terminated.");
                  break;
          }
      }
    }
    
}
