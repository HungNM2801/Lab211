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
    ArrayList<Candidate> listOfCandidate;

    public FresherCandidate(int candidateGraduationDate, String candidateGraduationRank, String candidateEducation, ArrayList<Candidate> listOfFresherCandidate) {
        this.candidateGraduationDate = candidateGraduationDate;
        this.candidateGraduationRank = candidateGraduationRank;
        this.candidateEducation = candidateEducation;
        this.listOfCandidate = listOfFresherCandidate;
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

    public ArrayList<Candidate> getListOfCandidate() {
        return listOfCandidate;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" + "candidateGraduationDate=" + candidateGraduationDate + ", candidateGraduationRank=" + candidateGraduationRank + ", candidateEducation=" + candidateEducation + ", listOfFresherCandidate=" + listOfCandidate + '}';
    }
}
