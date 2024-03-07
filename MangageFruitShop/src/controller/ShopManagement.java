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
public class ShopManagement {
    
    Hashtable<String, ArrayList<Fruit>> hashTable = new Hashtable<>();
    Validate validate = new Validate();
    
    public Fruit getFruitByID(ArrayList<Fruit> fruitList, int fruitID) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitID() == fruitID) {
                return fruit;
            }
        }
        return null;
    }
    
    
    public void shopping(ArrayList<Fruit> listFruit) {
        
        ArrayList<Fruit> listFruitBrought = new ArrayList<>();
        displayListOfFruit(listFruit);
        
        while (true) {
            
            System.out.println("To order, custommer select item: ");
            int userInput = validate.checkIntInput();

            Fruit selectedFruit = getFruitByID(listFruit, userInput);
            
            if (selectedFruit == null) {
                System.out.println("FruitID not found.");
                break;
            } else {
                System.out.println("You selected: " + selectedFruit.getFruitName());
                System.out.println("Please input quantity: "); 
                int quantity = validate.checkIntInput();
                selectedFruit.setQuantity(quantity);
                listFruitBrought.add(selectedFruit);
            } 
            System.out.println("Do you want to order now (Y/N) ?");
            String userChoice = validate.checkStringInput();
            if (userChoice.equalsIgnoreCase("Y")) {
                break;
            }
        }   
        displayInvoice(listFruitBrought);

    }
    
    public void displayListOfFruit(ArrayList<Fruit> fruitList) {
        
        System.out.println("====== List of Fruit ======");
        System.out.println("");
        
        System.out.printf("|%-10s | %-15s | %-12s | %-12s| \n",
                    " ++ Item ++ ", " ++ Fruit Name ++ ", " ++ Origin ++ ", " ++ Price ++ ");
        
        for(Fruit fruit : fruitList) {
            System.out.printf("| %-10s | %-16s | %-15s | %-18s | \n", 
                        fruit.getFruitID(), fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice() + "$");
        }
        
    }
    
    public void displayInvoice(ArrayList<Fruit> listFruitBrought) {
    if (!listFruitBrought.isEmpty()) {
        System.out.println("Product | Quantity | Price | Amount");
        double total = 0;

        for(Fruit fruit : listFruitBrought) {

            double amount = fruit.getQuantity() * fruit.getPrice();
            System.out.printf("|%-10s| %-12s| %-15s|%-10s \n",
                        fruit.getFruitName(), fruit.getQuantity(), fruit.getPrice() + "$", amount + "$");
            total += amount;
        }

        System.out.println("Total: " + total + "$");
        System.out.println("Input your name: ");
        String customerName = validate.checkStringInput();

        hashTable.put(customerName, listFruitBrought);

        System.out.println("Successfully!");
            
        }
    }
    
    public void displayOrder() {
        for(String customerName : hashTable.keySet()) {
            System.out.println("Customer: " + customerName);
            System.out.println("Product | Quantity | Price | Amount");
            double total = 0;
            
            for(Fruit fruit : hashTable.get(customerName)) {
                double amount = fruit.getQuantity() * fruit.getPrice();
                System.out.printf("%-10s | %-12s | %-15s | %s\n",
                            fruit.getFruitName(), fruit.getQuantity(), fruit.getPrice(), amount + "$");
                total += amount;
            }
            System.out.println("");
            System.out.println("Total: " + total + "$");
        }
    }
    
}
