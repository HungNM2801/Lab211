/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import model.Level;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class SearchCandidate {
    
    CreateCandidate createCandidate = new CreateCandidate();
    Validate validate = new Validate();
    
//    public void searchCandidate(ArrayList<Level> listOfAllCandidate) {
//        createCandidate.displayAllCandidate(listOfAllCandidate);
//        
//        System.out.println("Input Candidate name (firstname or lastname): ");
//        String name = validate.checkString();
//        System.out.println("Input type of Candidate: ");
//        int inputTypeOfCandidate = validate.checkInt();
//        
//        switch(inputTypeOfCandidate) {
//            
//            case 0:
//                Candidate expSelectedCandidate = getCandidateFromExpCListFirstName(listOfAllCandidate, name);
//                
//                if (expSelectedCandidate == null) {
//                    
//                    expSelectedCandidate = getCandidateFromExpCListLastName(listOfAllCandidate, name);
//                    
//                    if (expSelectedCandidate == null) {
//                        System.out.println("Candidate not in list");
//                    } else {
//                         System.out.printf("%-10s %-10s %-10s\n", expSelectedCandidate.getCandidateFirstName() + " " + expSelectedCandidate.getCandidateLastName(),
//                                                                    expSelectedCandidate.getCandidateBirthDate(), expSelectedCandidate.getCandidateAddress());
//                    }
//                    
//                } else {
//                    System.out.printf("%-10s %-10s %-10s\n", expSelectedCandidate.getCandidateFirstName() + " " + expSelectedCandidate.getCandidateLastName(),
//                                                                    expSelectedCandidate.getCandidateBirthDate(), expSelectedCandidate.getCandidateAddress());
//                }
//                break;
//                
//            case 1:
//                Candidate fresherSelectedCandidate = getCandidateFromFresherCListFirstName(listOfAllCandidate, name);
//                
//                if (fresherSelectedCandidate == null) {
//                    
//                    fresherSelectedCandidate = getCandidateFromFresherCListLastName(listOfAllCandidate, name);
//                    
//                    if (fresherSelectedCandidate == null) {
//                        System.out.println("Candidate not in list");
//                    } else {
//                         System.out.printf("%-10s %-10s %-10s\n", fresherSelectedCandidate.getCandidateFirstName() + " " + fresherSelectedCandidate.getCandidateLastName(),
//                                                                    fresherSelectedCandidate.getCandidateBirthDate(), fresherSelectedCandidate.getCandidateAddress());
//                    }
//                    
//                } else {
//                    System.out.printf("%-10s %-10s %-10s\n", fresherSelectedCandidate.getCandidateFirstName() + " " + fresherSelectedCandidate.getCandidateLastName(),
//                                                                    fresherSelectedCandidate.getCandidateBirthDate(), fresherSelectedCandidate.getCandidateAddress());
//                }
//                break;
//                
//            case 2:
//                Candidate internSelectedCandidate = getCandidateFromInternCListFirstName(listOfAllCandidate, name);
//                
//                if (internSelectedCandidate == null) {
//                    
//                    internSelectedCandidate = getCandidateFromInternCListLastName(listOfAllCandidate, name);
//                    if (internSelectedCandidate == null) {
//                        System.out.println("Candidate not in list");
//                    } else {
//                         System.out.printf("%-10s %-10s %-10s\n", internSelectedCandidate.getCandidateFirstName() + " " + internSelectedCandidate.getCandidateLastName(),
//                                                                    internSelectedCandidate.getCandidateBirthDate(), internSelectedCandidate.getCandidateAddress());
//                    }
//                    
//                } else {
//                    System.out.printf("%-10s %-10s %-10s\n", internSelectedCandidate.getCandidateFirstName() + " " + internSelectedCandidate.getCandidateLastName(),
//                                                                    internSelectedCandidate.getCandidateBirthDate(), internSelectedCandidate.getCandidateAddress());
//                }
//                break;
//            
//            default:
//                System.out.println("Invalid input");
//                break;
//        }
//    }
    
    public void searchCandidate(ArrayList<Level> listOfAllCandidate)  {
        createCandidate.displayAllCandidate(listOfAllCandidate);
        
        System.out.println("Enter name(firstName or lastName): ");
        String nameSearch = validate.checkString();
        System.out.println("Enter type of candidate: ");
        int candidateType = validate.checkInt();
        
        switch (candidateType) {
            
            case 0: 
                int countExp = 0;
                
                for(Level allCandidate : listOfAllCandidate) {
                    
                    for (ExperienceCandidate expCandidate : allCandidate.getListOfExperienceCandidate()) {
                        
                        if (expCandidate.getCandidate().getCandidateFirstName().contains(nameSearch) || expCandidate.getCandidate().getCandidateLastName().contains(nameSearch)) {
                            System.out.println(expCandidate.toString());
                            countExp++;
                        }
                    }
                    if (countExp == 0) {
                        System.out.println("Not found");
                    }
                }
                break;
                
            case 1:
                int countFresher = 0;
                
                for (Level allCandidate : listOfAllCandidate) {
                    
                    for (FresherCandidate fresherCandidate : allCandidate.getListOfFresherCandidate()) {
                        
                        if (fresherCandidate.getCandidate().getCandidateFirstName().contains(nameSearch) || fresherCandidate.getCandidate().getCandidateLastName().contains(nameSearch)) {
                            System.out.println(fresherCandidate.toString());
                            countFresher++;
                        }
                    }
                    if (countFresher == 0) {
                        System.out.println("Not found");
                    } 
                }
                break;
                
            case 2:
                int countIntern = 0;
                
                for (Level allCandidate : listOfAllCandidate) {
                    
                    for (InternCandidate internCandidate : allCandidate.getListOfInternCandidate()) {
                        
                        if (internCandidate.getCandidate().getCandidateFirstName().contains(nameSearch) || internCandidate.getCandidate().getCandidateLastName().contains(nameSearch)) {
                            System.out.println(internCandidate.toString());
                            countIntern++;
                        }
                    }
                    if (countIntern == 0) {
                        System.out.println("Not found");
                    }
                }
                break;
                
            default:
                System.out.println("Invalid Candidate Type");
                break;
        }
    }
    
    
//    public Candidate getCandidateFromExpCListFirstName (ArrayList<Level> listOfAllCandidate, String firstName) {
//        for(Level allCandidate : listOfAllCandidate) {
//            
//            for(ExperienceCandidate expCandidate : allCandidate.getListOfExperienceCandidate()) {
//                if (expCandidate.getCandidate().getCandidateFirstName().equalsIgnoreCase(firstName)) {
//                    return expCandidate.getCandidate();
//                }
//            }
//        }
//        return null;
//    }
//    
//    public Candidate getCandidateFromExpCListLastName (ArrayList<Level> listOfAllCandidate, String lastName) {
//        for(Level allCandidate : listOfAllCandidate) {
//            
//            for(ExperienceCandidate expCandidate : allCandidate.getListOfExperienceCandidate()) {
//                if (expCandidate.getCandidate().getCandidateLastName().equalsIgnoreCase(lastName)) {
//                    return expCandidate.getCandidate();
//                }
//            }
//        }
//        return null;
//    }
//    
//    public Candidate getCandidateFromFresherCListFirstName (ArrayList<Level> listOfAllCandidate, String firstName) {
//        for(Level allCandidate : listOfAllCandidate) {
//            
//            for(FresherCandidate fresherCandidate : allCandidate.getListOfFresherCandidate()) {
//                if (fresherCandidate.getCandidate().getCandidateFirstName().equalsIgnoreCase(firstName)) {
//                    return fresherCandidate.getCandidate();
//                }
//            }
//        }
//        return null;
//    }
//    
//    public Candidate getCandidateFromFresherCListLastName (ArrayList<Level> listOfAllCandidate, String lastName) {
//        for(Level allCandidate : listOfAllCandidate) {
//            
//            for(FresherCandidate fresherCandidate : allCandidate.getListOfFresherCandidate()) {
//                if (fresherCandidate.getCandidate().getCandidateLastName().equalsIgnoreCase(lastName)) {
//                    return fresherCandidate.getCandidate();
//                }
//            }
//        }
//        return null;
//    }
//    
//    public Candidate getCandidateFromInternCListFirstName (ArrayList<Level> listOfAllCandidate, String firstName) {
//        for(Level allCandidate : listOfAllCandidate) {
//            
//            for(InternCandidate internCandidate: allCandidate.getListOfInternCandidate()) {
//                if (internCandidate.getCandidate().getCandidateFirstName().equalsIgnoreCase(firstName)) {
//                    return internCandidate.getCandidate();
//                }
//            }
//        }
//        return null;
//    }
//    public Candidate getCandidateFromInternCListLastName (ArrayList<Level> listOfAllCandidate, String lastName) {
//        for(Level allCandidate : listOfAllCandidate) {
//            
//            for(InternCandidate internCandidate : allCandidate.getListOfInternCandidate()) {
//                if (internCandidate.getCandidate().getCandidateLastName().equalsIgnoreCase(lastName)) {
//                    return internCandidate.getCandidate();
//                }
//            }
//        }
//        return null;
//    }
//    
}
