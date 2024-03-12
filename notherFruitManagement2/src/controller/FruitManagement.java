/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Fruit;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class FruitManagement {
    
    Validate validate = new Validate();
    
    public void createFruit(ArrayList<Fruit> fruitList) {
        
        System.out.println("====== Create Fruit ======");
        
        while (true) {
            System.out.println("Enter fruit name: ");
            String fruitName = validate.checkStringInput();
            
            if (validate.checkFruitByName(fruitList, fruitName)) {
                System.out.println("Fruit already exist in DB.");
                break;
            } else {
                System.out.println("Enter fruitID: ");
                int fruitID = validate.checkIntinput();
                if (validate.checkFruitByID(fruitList, fruitID)) {
                    System.out.println("FruitID already exist in DB.");
                    break;
                } else {
                    System.out.println("Enter fruit price: ");
                    double fruitPrice = validate.checkDoubleInput();
                    System.out.println("Enter fruit quantity: ");
                    int fruitQuantity = validate.checkIntinput();
                    System.out.println("Enter fruit origin: ");
                    String fruitOrigin = validate.checkStringInput();
                    
                    fruitList.add(new Fruit(fruitID, fruitName, fruitPrice, fruitQuantity, fruitOrigin));
                    
                    System.out.println("Do you want to continue (Y/N)?");
                    String userChoice = validate.checkStringInput();
                    
                    if (userChoice.equalsIgnoreCase("N")) {
                        break;
                    } else if (!userChoice.equalsIgnoreCase("Y")) {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            }
        }   
    }
    
}
