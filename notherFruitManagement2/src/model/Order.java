/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HÙNG
 */
public class Order {
    private String customerName;
    final ArrayList<Fruit> listPurchasedFruit;

    public Order(String customerName, ArrayList<Fruit> listPurchasedFruit) {
        this.customerName = customerName;
        this.listPurchasedFruit = listPurchasedFruit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Fruit> getListPurchasedFruit() {
        return listPurchasedFruit;
    }
    
    @Override
    public String toString() {
        return "Order{" + "customerName=" + customerName + ", listPurchasedFruit=" + listPurchasedFruit + '}';
    }
    
    
}
