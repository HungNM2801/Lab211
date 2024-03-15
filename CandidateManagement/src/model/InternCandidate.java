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
public class InternCandidate {
    
    private int candidateMajor;
    private String candidateSemester;
    private String candidateUniversityName;
    ArrayList<Candidate> listOfCandidate;

    public InternCandidate(int candidateMajor, String candidateSemester, String candidateUniversityName, ArrayList<Candidate> listOfInternCandidate) {
        this.candidateMajor = candidateMajor;
        this.candidateSemester = candidateSemester;
        this.candidateUniversityName = candidateUniversityName;
        this.listOfCandidate = listOfInternCandidate;
    }

    public void setCandidateMajor(int candidateMajor) {
        this.candidateMajor = candidateMajor;
    }

    public void setCandidateSemester(String candidateSemester) {
        this.candidateSemester = candidateSemester;
    }

    public void setCandidateUniversityName(String candidateUniversityName) {
        this.candidateUniversityName = candidateUniversityName;
    }

    public int getCandidateMajor() {
        return candidateMajor;
    }

    public String getCandidateSemester() {
        return candidateSemester;
    }
    
    public String getCandidateUniversityName() {
        return candidateUniversityName;
    }

    public ArrayList<Candidate> getListOfCandidate() {
        return listOfCandidate;
    }

    @Override
    public String toString() {
        return "InternCandidate{" + "candidateMajor=" + candidateMajor + ", candidateSemester=" + candidateSemester + ", candidateUniversityName=" + candidateUniversityName + ", listOfInternCandidate=" + listOfCandidate + '}';
    }
}
