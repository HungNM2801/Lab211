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
public class FresherCandidate {
    
    private int candidateGraduationDate;
    private String candidateGraduationRank;
    private String candidateEducation;
    private int candidateType;
    private Candidate candidate;

    public FresherCandidate(int candidateGraduationDate, String candidateGraduationRank, String candidateEducation, int candidateType, Candidate candidate) {
        this.candidateGraduationDate = candidateGraduationDate;
        this.candidateGraduationRank = candidateGraduationRank;
        this.candidateEducation = candidateEducation;
        this.candidateType = candidateType;
        this.candidate = candidate;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }


    public void setCandidateGraduationDate(int candidateGraduationDate) {
        this.candidateGraduationDate = candidateGraduationDate;
    }

    public void setCandidateGraduationRank(String candidateGraduationRank) {
        this.candidateGraduationRank = candidateGraduationRank;
    }

    public void setCandidateEducation(String candidateEducation) {
        this.candidateEducation = candidateEducation;
    }

    public int getCandidateGraduationDate() {
        return candidateGraduationDate;
    }

    public String getCandidateGraduationRank() {
        return candidateGraduationRank;
    }

    public String getCandidateEducation() {
        return candidateEducation;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    @Override
    public String toString() {
        return candidate + "|" + candidateGraduationDate + "|" + candidateGraduationRank + "|" 
                + candidateEducation + "|" + candidateType;
    }
    
    

    
}
