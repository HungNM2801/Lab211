/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drive;

import controller.CreateCandidate;
import controller.SearchCandidate;
import static gui.Menu.display;
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
        SearchCandidate searchCandidate = new SearchCandidate();
        

        int userInput = 0;
        
        while (userInput != 5) {
            display();
            userInput = validate.checkInt();
            
            switch(userInput) {
                case 1:
                    createCandidate.createCandidate(listOfAllCandidate, 0);
                    break;
                case 2:
                    createCandidate.createCandidate(listOfAllCandidate, 1);
                    break;
                case 3:
                    createCandidate.createCandidate(listOfAllCandidate, 2);
                    break;
                case 4:
                    searchCandidate.searchCandidate(listOfAllCandidate);
                    break;
                case 5:
                    System.out.println("PROGRAM TERMINATED.");
                    break;
                    
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
