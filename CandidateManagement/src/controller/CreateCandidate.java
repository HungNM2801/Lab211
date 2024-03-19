/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Candidate;
import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import model.Level;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class CreateCandidate {
    
    Validate validate = new Validate();
    
    public Candidate createCandidateInfo(ArrayList<Level> listOfAllCandidate) {
            
        boolean isValidCandidate = false;
        while (!isValidCandidate) {
            System.out.println("Enter candidateID: ");
            String candidateID = validate.checkString();

            if (!validate.checkIDInExpList(listOfAllCandidate, candidateID) && !validate.checkIDInFresherList(listOfAllCandidate, candidateID) && !validate.checkIDInInternList(listOfAllCandidate, candidateID)) {
                System.out.println("Enter first name:  ");
                String candidateFirstName = validate.checkName();
                System.out.println("Enter last name: ");
                String candidateLastName = validate.checkName();
                System.out.println("Enter date of birth: ");    
                int dateOfBirth = validate.checkBirthDate();
                System.out.println("Enter phone number: ");
                int phoneNumber = validate.checkPhoneNumber();
                System.out.println("Enter email: ");
                String email = validate.checkEmail();

    //            listOfCandidate.add(new Candidate(candidateID, candidateFirstName, candidateLastName, dateOfBirth, candidateID, phoneNumber, email));

                Candidate newCandidate = new Candidate(candidateID, candidateFirstName, candidateLastName, dateOfBirth, candidateID, phoneNumber, email);
                return newCandidate;

            } else {
                System.out.println("ID already exist in DB");
            }
        } 
        return null;
    }
    
//    public int enterTypeOfCandidate()  {
//                
//        System.out.println("====== Create Candidate ======");
//        System.out.println("");
//        System.out.println("Enter type of candidate to add info: ");
//        int candidateType = validate.checkInt();
//
//        return candidateType;
//    }
    
    
    public void createCandidate(ArrayList<Level> listOfAllCandidate, int candidateType) {
        
//        ArrayList<Candidate> listOfCandidate = new ArrayList<>();
        ArrayList<InternCandidate> listOfInternCandidate = new ArrayList<>();
        ArrayList<FresherCandidate> listOfFresherCandidate = new ArrayList<>();
        ArrayList<ExperienceCandidate> listOfExperienceCandidate = new ArrayList<>();
        
//        int inputCandidateType = enterTypeOfCandidate();
        
        while (true) {
      
            switch(candidateType) {
                
                case 0:
                    
                    
                    Candidate newExperienceCandidate =  createCandidateInfo(listOfAllCandidate);
                    System.out.println("Enter yearOfExp: ");
                    int yearOfExp = validate.checkNumberOfExp();
                    System.out.println("Enter proSkill: ");
                    String proSkill = validate.checkString();
                    ExperienceCandidate experienceCandidate = new ExperienceCandidate(yearOfExp, proSkill, candidateType, newExperienceCandidate);
                    listOfExperienceCandidate.add(experienceCandidate);
                    break;
                    
                case 1:
                    Candidate newFresherCandidate = createCandidateInfo(listOfAllCandidate);
                    System.out.println("Enter graduation time: "); 
                    int graduationTime = validate.checkInt();
                    System.out.println("Enter rank of graduation: ");
                    String rankOfGraduation = validate.checkRankOfGraduation();
                    System.out.println("Enter university: ");
                    String university = validate.checkString();
                    
                    FresherCandidate freshserCandidate = new FresherCandidate(graduationTime, rankOfGraduation, university, candidateType,newFresherCandidate);
                    listOfFresherCandidate.add(freshserCandidate);
                    break;
                    
                    
                case 2: 
                    Candidate newInternCandidate = createCandidateInfo(listOfAllCandidate);
                    System.out.println("Enter majors: ");
                    int major = validate.checkInt();
                    System.out.println("Enter semester: ");
                    String semester = validate.checkString();
                    System.out.println("Enter university: ");
                    String universityName = validate.checkString();
                    
                    InternCandidate internCandidate = new InternCandidate(major, semester, universityName, candidateType ,newInternCandidate);
                    listOfInternCandidate.add(internCandidate);
                    break;
            }
            
            
            
            System.out.println("Do you want to continue(Y/N) ?");
            String userInput = validate.checkString();
            if (userInput.equalsIgnoreCase("N")) {
                break;
            } 
        }
            
        displayAllCreatedCandidate(listOfExperienceCandidate, listOfFresherCandidate, listOfInternCandidate);

        Level level = new Level(listOfExperienceCandidate, listOfFresherCandidate, listOfInternCandidate);
        listOfAllCandidate.add(level);
        
    }
    
    public void displayAllCandidate(ArrayList<Level> listOfAllCandidate) {
        
        System.out.println("List Of Created Student ");
        
        System.out.println("======== EXPERIENCE CANDIDATE ========");
        System.out.println("");
        for (Level allCandidate : listOfAllCandidate) {
            
            for (ExperienceCandidate expCandidate : allCandidate.getListOfExperienceCandidate()) {
                System.out.printf("%-10s %-10s %-10s\n",
                        expCandidate.getCandidate().getCandidateFirstName(),
                        expCandidate.getCandidate().getCandidateLastName(),
                        expCandidate.getCandidateType());
            }
        }
        System.out.println("");
        System.out.println("======== FRESHER CANDIDATE ========");
        System.out.println("");
        for(Level allCandidate : listOfAllCandidate) {
           
            for (FresherCandidate fresherCandidate : allCandidate.getListOfFresherCandidate()) {
                System.out.printf("%-10s %-10s %-10s\n",
                        fresherCandidate.getCandidate().getCandidateFirstName(),
                        fresherCandidate.getCandidate().getCandidateLastName(),
                        fresherCandidate.getCandidateType());
            }
        }
        System.out.println("");
        System.out.println("======== INTERN CANDIDATE ========");
        System.out.println("");
        for (Level allCandidate : listOfAllCandidate) {
            
            for (InternCandidate internCandidate : allCandidate.getListOfInternCandidate()) {
                System.out.printf("%-10s %-10s %-10s\n",
                        internCandidate.getCandidate().getCandidateFirstName(),
                        internCandidate.getCandidate().getCandidateLastName(),
                        internCandidate.getCandidateType());
            }
        }   
    }
    
    private void displayAllCreatedCandidate(ArrayList<ExperienceCandidate> listOfExperienceCanidate,
                                            ArrayList<FresherCandidate> listOfFresherCandidate,
                                            ArrayList<InternCandidate> listOfInternCandidate) {
        
        for(ExperienceCandidate newExpCandidate : listOfExperienceCanidate) {
            System.out.println(newExpCandidate.toString());
        }    
        System.out.println("");
        
        for(FresherCandidate newFresherCandidate : listOfFresherCandidate) {
            System.out.println(newFresherCandidate.toString());
        }
        System.out.println("");
        
        for(InternCandidate newInternCandidate : listOfInternCandidate) {
            System.out.println(newInternCandidate.toString());
        }
        
    }
}
