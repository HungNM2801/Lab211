/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drive;

import controller.CreateCandidate;
import java.util.ArrayList;
import model.Level;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class run {
    
    public static void main(String[] args) {
        
        ArrayList<Level> listOfAllCandidate = new ArrayList<>();
        
        Validate validate = new Validate();
        CreateCandidate createCandidate = new CreateCandidate();
        
//        validate.checkBirthDate();
//        validate.checkPhoneNumber();
//        validate.checkRankOfGraduation();
        
        createCandidate.addCandidateLevel(listOfAllCandidate);
    }
    
}
