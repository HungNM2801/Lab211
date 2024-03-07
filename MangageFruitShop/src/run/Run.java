/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.FruitManagement;
import controller.ShopManagement;
import static gui.Menu.display;
import java.util.ArrayList;
import model.Fruit;
import util.Validate;

/**
 *
 * @author HÙNG
 */
public class Run {
    
    public static void main(String[] args) {
        
        ArrayList<Fruit> fruitList = new ArrayList<>();
        Validate validate = new Validate();
        FruitManagement manageFruit = new FruitManagement();
        ShopManagement manageShop = new ShopManagement();
        
        int input = 0;
        
        while (input != 4) {
            display();
            input = validate.checkIntInput();
            
            switch(input) {
                
                case 1: 
                    manageFruit.createFruit(fruitList);
                    break;
                    
                case 2: 
                    manageShop.displayOrder();
                    break;
                    
                case 3: 
                    manageShop.shopping(fruitList);
                    break;
                    
                case 4: 
                    System.out.println("PROGRAM TERMINATED.");
                    break;
                    
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }
}
