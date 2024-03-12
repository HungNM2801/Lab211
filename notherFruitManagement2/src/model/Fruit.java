/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HÙNG
 */
public class Fruit {
    
    private int fruitID;
    private String fruitName;
    private double fruitPrice;
    private int fruitQuantity;
    private String fruitOrigin;

    public Fruit(int fruitID, String fruitName, double fruitPrice, int fruitQuantity, String fruitOrigin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.fruitQuantity = fruitQuantity;
        this.fruitOrigin = fruitOrigin;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public void setFruitQuantity(int fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
    }

    public void setFruitOrigin(String fruitOrigin) {
        this.fruitOrigin = fruitOrigin;
    }

    public int getFruitID() {
        return fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public int getFruitQuantity() {
        return fruitQuantity;
    }

    public String getFruitOrigin() {
        return fruitOrigin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitID=" + fruitID + ", fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + ", fruitQuantity=" + fruitQuantity + ", fruitOrigin=" + fruitOrigin + '}';
    }
    
    
    
    
}
