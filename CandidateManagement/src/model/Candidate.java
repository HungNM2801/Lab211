/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HÙNG
 */
public class Candidate {
    private String candidateID;
    private String candidateFirstName;
    private String candidateLastName;
    private int candidateBirthDate;
    private String candidateAddress;
    private int candidatePhoneNumber;
    private String candidateEmail;

    public Candidate(String candidateID, String candidateFirstName, String candidateLastName, int candidateBirthDate, String candidateAddress, int candidatePhoneNumber, String candidateEmail) {
        this.candidateID = candidateID;
        this.candidateFirstName = candidateFirstName;
        this.candidateLastName = candidateLastName;
        this.candidateBirthDate = candidateBirthDate;
        this.candidateAddress = candidateAddress;
        this.candidatePhoneNumber = candidatePhoneNumber;
        this.candidateEmail = candidateEmail;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }
    
    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public void setCandidateFirstName(String candidateFirstName) {
        this.candidateFirstName = candidateFirstName;
    }

    public void setCandidateLastName(String candidateLastName) {
        this.candidateLastName = candidateLastName;
    }

    public void setCandidateBirthDate(int candidateBirthDate) {
        this.candidateBirthDate = candidateBirthDate;
    }

    public void setCandidateAddress(String candidateAddress) {
        this.candidateAddress = candidateAddress;
    }

    public void setCandidatePhoneNumber(int candidatePhoneNumber) {
        this.candidatePhoneNumber = candidatePhoneNumber;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getCandidateFirstName() {
        return candidateFirstName;
    }

    public String getCandidateLastName() {
        return candidateLastName;
    }

    public int getCandidateBirthDate() {
        return candidateBirthDate;
    }

    public String getCandidateAddress() {
        return candidateAddress;
    }

    public int getCandidatePhoneNumber() {
        return candidatePhoneNumber;
    }

    @Override
    public String toString() {
        return "Candidate{" + "candidateID=" + candidateID + ", candidateFirstName=" + candidateFirstName + ", candidateLastName=" + candidateLastName + ", candidateBirthDate=" + candidateBirthDate + ", candidateAddress=" + candidateAddress + ", candidatePhoneNumber=" + candidatePhoneNumber + ", candidateEmail=" + candidateEmail + '}';
    }

   
}
