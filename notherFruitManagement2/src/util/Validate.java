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
    
    Scanner scanner = new Scanner(System.in);
    
    public int checkIntinput() {
        
        int input;
        String userInput;
        
        while (true) {
            try {
                userInput = scanner.next().trim();
                input = Integer.parseInt(userInput);
                if (input >=0 && String.valueOf(input).length() <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter input between 0 - 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid int input.");
            }
        }
        return input;
    }
    
    public String checkStringInput() {
        
        String input;
        
        while (true) {
            input = scanner.next();
            
            if(input.matches("[a-zA-Z]+") && !input.isEmpty()) {
                break;
            } else 
                System.out.println("Invalid input. Please enter valid input. ");
        }
        return input;
    }
    
    public double checkDoubleInput() {
        double input;
        String userInput;
        
        while (true) {
            try {
                userInput = scanner.next().trim();
                input = Double.parseDouble(userInput);

                if(input >= 0 && String.valueOf(input).length() <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid double input. ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid int input.");
            }
        }
        return input;
    }
    
    public boolean checkFruitByName(ArrayList<Fruit> fruitList, String name) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkFruitByID(ArrayList<Fruit> fruitList, int FruitID) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitID() == FruitID) {
                return true;
            }
        }
        return false;
    }
    
    public void close() {
        scanner.close();
    }
}
