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
    private int candidateType;
    private Candidate candidate;

    public ExperienceCandidate(int expInYear, String proSkill, int candidateType, Candidate candidate) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.candidateType = candidateType;
        this.candidate = candidate;
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

    public Candidate getCandidate() {
        return candidate;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return candidate + "|" + expInYear + "|" + proSkill + "|" + candidateType;
    }
    
    

    
}
