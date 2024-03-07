/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Hashtable;
import model.Fruit;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class FruitManagement {
    
    Hashtable<String, ArrayList<Fruit>> hashTable = new Hashtable<>();
    Validate validate = new Validate();
    
    
    public void createFruit(ArrayList<Fruit> fruitList) {
        
        System.out.println("====== Create Fruit ======");
        
        while(true) {
            System.out.print("Enter fruit name: ");
            String fruitName = validate.checkStringInput();

            if (validate.checkFruitByName(fruitList, fruitName)) {
                System.out.println("Fruit already exist in DB. ");
                break;
            } else {
                System.out.print("Enter fruitID: ");
                int fruitID = validate.checkIntInput();
                System.out.print("Enter fruit price: ");
                double fruitPrice = validate.checkDoubleInput();
                System.out.print("Enter Quantity: ");
                int quantity = validate.checkIntInput();
                System.out.print("Enter origin: ");
                String origin = validate.checkStringInput();

                fruitList.add(new Fruit(fruitID, fruitName, fruitPrice, quantity, origin));

                System.out.println("Do you want to continue (Y/N) ? Chooses Y to continue, chooses N to return to main screen.");

                String choice = validate.checkStringInput();

                if (choice.equalsIgnoreCase("Y")) {
                    continue;
                } else if (choice.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter again.");
                }
            }
        } 
    }
    
    
}
