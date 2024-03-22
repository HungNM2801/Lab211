/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author HÙNG
 */
public class Validate {
    
     Scanner scanner = new Scanner(System.in);
        
    public int checkIntinput() {
        
        int input;
        String userInput;
        
        while (true) {
            try {
                userInput = scanner.next().trim();
                input = Integer.parseInt(userInput);
                if (input >=0 && String.valueOf(input).length() <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter input between 0 - 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid int input.");
            }
        }
        return input;
    }
    
    public String checkStringInput() {
        
        String input;
        
        while (true) {
            input = scanner.next();
            
            if(input.matches("[a-zA-Z]+") && !input.isEmpty()) {
                break;
            } else 
                System.out.println("Invalid input. Please enter valid input. ");
        }
        return input;
    }
    
    public double checkDoubleInput() {
        double input;
        String userInput;
        
        while (true) {
            try {
                userInput = scanner.next().trim();
                input = Double.parseDouble(userInput);

                if(input >= 0 && String.valueOf(input).length() <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid double input. ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid int input.");
            }
        }
        return input;
    }
     public boolean checkInputUD() {
        //loop until user input correct
        while (true) {
            String result = checkStringInput();
            //return true if user input u/U
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            //return false if user input d/D
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input U or D.");
            System.out.print("Enter again: ");
        }
    }
     
     public static String checkInputCourse() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check input course in java/ .net/ c/c++
            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }
     
     public void createStudent() {
        while (true) {
            String id = validation.inputString("Enter id:", "[A-Za-z0-9\\s]");
            Student student = checkIdExist(id);
            String name;
    
    public void close() {
        scanner.close();
    }

}
