/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author HÙNG
 */
public class InternCandidate {
    
    private int candidateMajor;
    private String candidateSemester;
    private String candidateUniversityName;
    private int candidateType;
    private Candidate candidate;

    public InternCandidate(int candidateMajor, String candidateSemester, String candidateUniversityName, int candidateType, Candidate candidate) {
        this.candidateMajor = candidateMajor;
        this.candidateSemester = candidateSemester;
        this.candidateUniversityName = candidateUniversityName;
        this.candidateType = candidateType;
        this.candidate = candidate;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    public int getCandidateType() {
        return candidateType;
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

    public Candidate getCandidate() {
        return candidate;
    }

    @Override
    public String toString() {
        return candidate + "|" + candidateMajor + "|" + candidateSemester + "|" + candidateUniversityName + "|" + candidateType;
    }

    
}
