/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.Scanner;
import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import model.Level;

/**
 *
 * @author HÙNG
 */
public class Validate {
    
    Scanner scanner = new Scanner(System.in);
    
//    public int checkIntinput() {
//        
//        int input;
//        String userInput;
//        
//        while (true) {
//            try {
//                userInput = scanner.next().trim();
//                input = Integer.parseInt(userInput);
//                if (input >=0 && String.valueOf(input).length() <= 6) {
//                    break;
//                } else {
//                    System.out.println("Invalid input. Please enter input between 0 - 6.");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter valid int input.");
//            }
//        }
//        return input;
//    }
    
//    public String checkStringInput() {
//        
//        String input;
//        
//        while (true) {
//            input = scanner.next();
//            
//            if(input.matches("[a-zA-Z]+") && !input.isEmpty()) {
//                break;
//            } else 
//                System.out.println("Invalid input. Please enter valid input. ");
//        }
//        return input;
//    }
    
//    public double checkDoubleInput() {
//        double input;
//        String userInput;
//        
//        while (true) {
//            try {
//                userInput = scanner.next().trim();
//                input = Double.parseDouble(userInput);
//
//                if(input >= 0 && String.valueOf(input).length() <= 6) {
//                    break;
//                } else {
//                    System.out.println("Invalid input. Please enter valid double input. ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter valid int input.");
//            }
//        }
//        return input;
//    }
    
    public int checkInt() {
        
        int input;
        String userInput;
        
        while (true) {
            try {
                
                userInput = scanner.next().trim();
                input = Integer.parseInt(userInput);
                break;
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid int input.");
            }
        }
        return input;
    }
    
     public String checkString() {
        
        String input;
        
        while (true) {
            input = scanner.next();
            
            if(!input.isEmpty()) {
                break;
            } else 
                System.out.println("Invalid input. Please enter valid input. ");
        }
        return input;
    }
    
    public int checkBirthDate() {
        
        int checkbirhtDate = checkInt();
        
        while (true) {
            if (String.valueOf(checkbirhtDate).length() == 4 && checkbirhtDate >= 1900 && checkbirhtDate <= 2024) {
                break;
            } else {
                System.out.println("Invalid birthDate format. Please try again. ");
                checkbirhtDate = checkInt();
            }
        }
        return checkbirhtDate;
    }
    
    public int checkPhoneNumber() {
        
        int phoneNumber = checkInt();
        
        while (true) {
            if (phoneNumber >=0 && String.valueOf(phoneNumber).length() <= 10) {
                break;
            } else {
                System.out.println("Invalid phoneNumber format. Please try again. ");
                phoneNumber = checkInt();
            }
        }
        return phoneNumber;
    }
    
    public String checkEmail() {
        String email = checkString();
        while (true) {
            
            if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter valid email input. ");
                email = checkString();
            }
               
        }
        return email;
        
    }
    
    public int checkNumberOfExp() {
        int numberOfExp = checkInt();
        
        while (true) {
            if (numberOfExp > 0 && String.valueOf(numberOfExp).length() < 100) {
                break;
            } else {
                System.out.println("Invalid birthDate format. Please try again. ");
                numberOfExp = checkInt();
            }
        }
        return numberOfExp;
    }
    
    public boolean rankOfGraduation(String rank) {
        String[] validRanks = {"Excellence", "Good", "Fair", "Poor"};
        
        for (String validRank : validRanks) {
            if (validRank.equalsIgnoreCase(rank)) {
                return true;
            }
        }
        return false;
    }
    
    public String checkRankOfGraduation() {
        String rank = checkString();
        
        while (true) {
            if (rankOfGraduation(rank)) {
                break;
            } else {
                System.out.println("Please enter valid rank format. Excellence, Good, Fair, Poor");
                rank = checkString();
            }
        }
        return rank;
    }
    
    public String checkName() {
        String name = checkString();
        while (true) {
            
            if(name.matches("[a-zA-Z]+") && !name.isEmpty()) {
                break;
            } else 
                System.out.println("Invalid input. Please enter valid input. ");
        }
        return name;
    }
    
    public boolean checkIDInExpList(ArrayList<Level> listOfAllCandidate, String id) {
        
        for(Level allCandidate : listOfAllCandidate) {
            for(ExperienceCandidate expCandidate : allCandidate.getListOfExperienceCandidate()) {
                if (expCandidate.getCandidate().getCandidateID().equalsIgnoreCase(id)) {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public boolean checkIDInFresherList(ArrayList<Level> listOfAllCandidate, String id) {

        for(Level allCandidate : listOfAllCandidate) {
            for(FresherCandidate fresherCandidate : allCandidate.getListOfFresherCandidate()) {
                if (fresherCandidate.getCandidate().getCandidateID().equalsIgnoreCase(id)) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean checkIDInInternList(ArrayList<Level> listOfAllCandidate, String id) {

        for(Level allCandidate : listOfAllCandidate) {
            for(InternCandidate internCandidate : allCandidate.getListOfInternCandidate()) {
                if (internCandidate.getCandidate().getCandidateID().equalsIgnoreCase(id)) {
                    return true;
                }
            }
        }
        return false;

    }
    
    
    public void close() {
        scanner.close();
    }
    
}
