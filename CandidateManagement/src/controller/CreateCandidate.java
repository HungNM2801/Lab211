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
    
    public int createCandidateInfo(ArrayList<Candidate> listOfCandidate) {
        
        System.out.println("====== Create Candidate ======");
        
            System.out.println("Enter candidateID: ");
            String candidateID = validate.checkString();
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
            
            listOfCandidate.add(new Candidate(candidateID, candidateFirstName, candidateLastName, dateOfBirth, candidateID, phoneNumber, email));
            
            System.out.println("Enter Candidate type: ");
            int candidateType = validate.checkInt();
            
            return candidateType;
        
    }
    
    public void addCandidateLevel(ArrayList<Level> listOfAllCandidate) {
        
        ArrayList<Candidate> listOfCandidate = new ArrayList<>();
        ArrayList<InternCandidate> listOfInternCandidate = new ArrayList<>();
        ArrayList<FresherCandidate> listOfFresherCandidate = new ArrayList<>();
        ArrayList<ExperienceCandidate> listOfExperienceCandidate = new ArrayList<>();
        
        while (true) {
            
            int result = createCandidateInfo(listOfCandidate);
            
            
            switch(result) {
                
                case 0:
                    
                    System.out.println("Enter yearOfExp: ");
                    int yearOfExp = validate.checkNumberOfExp();
                    System.out.println("Enter proSkill: ");
                    String proSkill = validate.checkString();
                    ExperienceCandidate experienceCandidate = new ExperienceCandidate(yearOfExp, proSkill, listOfCandidate);
                    listOfExperienceCandidate.add(experienceCandidate);
                    break;
                    
                case 1:
                    System.out.println("Enter graduation time: "); 
                    int graduationTime = validate.checkInt();
                    System.out.println("Enter rank of graduation: ");
                    String rankOfGraduation = validate.checkRankOfGraduation();
                    System.out.println("Enter university: ");
                    String university = validate.checkString();
                    
                    FresherCandidate freshserCandidate = new FresherCandidate(graduationTime, rankOfGraduation, university, listOfCandidate);
                    listOfFresherCandidate.add(freshserCandidate);
                    break;
                    
                    
                case 2: 
                    System.out.println("Enter majors: ");
                    int major = validate.checkInt();
                    System.out.println("Enter semester: ");
                    String semester = validate.checkString();
                    System.out.println("Enter university: ");
                    String universityName = validate.checkString();
                    
                    InternCandidate internCandidate = new InternCandidate(major, semester, universityName, listOfCandidate);
                    listOfInternCandidate.add(internCandidate);
                    break;
            }
            System.out.println("Do you want to continue(Y/N) ?");
            String userInput = validate.checkString();
            if (userInput.equalsIgnoreCase("N")) {
                break;
            }
            
        }
        
        Level level = new Level(listOfExperienceCandidate, listOfFresherCandidate, listOfInternCandidate);
        listOfAllCandidate.add(level);
    }
}
