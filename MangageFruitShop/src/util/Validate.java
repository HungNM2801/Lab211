/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.Scanner;
import model.Fruit;

/**
 *
 * @author HÙNG
 */
public class Validate {
    
    Scanner sc = new Scanner(System.in);
    
    public int checkIntInput() {
        
        int input = 0;
        while (true) {
            try {
                String userInput = sc.nextLine();
                input = Integer.parseInt(userInput);
                if(input >= 0 && String.valueOf(input).length() <= 6) {
                    break;
                } else 
                    System.out.println("Invalid input. Please enter input between length 0 - 6 (Ex. 100000).");
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid int input.");
            }
        }
        return input;
    }
    
    public String checkStringInput() {
        
        String input = "";
        
        while (true) {
            input = sc.nextLine().trim();
            if (input.matches("[a-zA-Z]+") && !input.isEmpty()) {
                break;
            } else 
                System.out.println("Invalid input. Please enter valid input. ");
        }
        return input;
    }
    
    public double checkDoubleInput() {
        
        double input = 0.0;
        while (true) {
            try {
                String userInput = sc.nextLine().trim();
                input = Double.parseDouble(userInput);
                if (input >= 0 && String.valueOf(input).length() <= 6) {
                    break;
                } else 
                    System.out.println("Invalid input. Please enter input between length 0 - 6 (Ex. 100.000). ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid input.");
            }
        }
        return input;
    }
    
    public boolean checkFruitByName(ArrayList<Fruit> fruitList, String fruitName ) {
        for(Fruit fruit : fruitList) {
            if (fruit.getFruitName().equalsIgnoreCase(fruitName)) {
                return true;
            }
        }
        return false;
    }
}
