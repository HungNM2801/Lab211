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
public class ExperienceCandidate {
    private int expInYear;
    private String proSkill;
    ArrayList<Candidate> listOfCandidate;

    public ExperienceCandidate(int expInYear, String proSkill, ArrayList<Candidate> listOfExperienceCandidate) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.listOfCandidate = listOfExperienceCandidate;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public ArrayList<Candidate> getListOfCandidate() {
        return listOfCandidate;
    }

    @Override
    public String toString() {
        return "ExperienceCandidate{" + "expInYear=" + expInYear + ", proSkill=" + proSkill + ", listOfExperienceCandidate=" + listOfCandidate + '}';
    }
    
    
}
