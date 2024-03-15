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
public class Level {
    
    ArrayList<ExperienceCandidate> listOfExperienceCandidate; 
    ArrayList<FresherCandidate> listOfFresherCandidate;
    ArrayList<InternCandidate> listOfInternCandidate;

    public Level(ArrayList<ExperienceCandidate> listOfExperienceCandidate, ArrayList<FresherCandidate> listOfFresherCandidate, ArrayList<InternCandidate> listOfInternCandidate) {
        this.listOfExperienceCandidate = listOfExperienceCandidate;
        this.listOfFresherCandidate = listOfFresherCandidate;
        this.listOfInternCandidate = listOfInternCandidate;
    }

    public ArrayList<ExperienceCandidate> getListOfExperienceCandidate() {
        return listOfExperienceCandidate;
    }

    public ArrayList<FresherCandidate> getListOfFresherCandidate() {
        return listOfFresherCandidate;
    }

    public ArrayList<InternCandidate> getListOfInternCandidate() {
        return listOfInternCandidate;
    }
    
    
    
}
