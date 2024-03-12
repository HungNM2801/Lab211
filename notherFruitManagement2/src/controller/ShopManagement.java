    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package controller;

    import java.util.ArrayList;
    import model.Fruit;
    import model.Order;
    import util.Validate;

    /**
     *
     * @author HÙNG
     */
    public class ShopManagement {
        
        Validate validate = new Validate();

        public Fruit getFruitByID(ArrayList<Fruit> fruitList, int fruitID) {
            for (Fruit fruit : fruitList) {
                if (fruit.getFruitID() == fruitID) {
                    return fruit;
                }
            }
            return null;
        }

        public int getFruitQuantity(ArrayList<Fruit> fruitList, int fruitID) {
            for (Fruit fruit : fruitList) {
                if (fruit.getFruitID() == fruitID) {
                    return fruit.getFruitQuantity();
                }
            }
            return 0;
        }

        public void calculateRemainningFruit(ArrayList<Fruit> fruitList, int fruitID, int fruitInputQuantity) {
            int remainningFruit;
            for (Fruit fruit : fruitList) {
                if (fruit.getFruitID() == fruitID) {
                    remainningFruit = fruit.getFruitQuantity() - fruitInputQuantity;
                    fruit.setFruitQuantity(remainningFruit);
                }
            }
        }


        public void shopping(ArrayList<Fruit> fruitList, ArrayList<Order> listOfCustomerOrder) {

            ArrayList<Fruit> fruitPurchasedList = new ArrayList<>();
            displayListOfFruit(fruitList);

            while (true) {

                System.out.println("To order, customer select item: ");
                int userInput = validate.checkIntinput();

                if (getFruitByID(fruitList, userInput) == null) {
                    System.out.println("FruitID does not exist in DB.");
                } else {
                    Fruit selectedFruit = getFruitByID(fruitList, userInput);
                    int quantityOfSelectedFruit = getFruitQuantity(fruitList, userInput);

                    if (quantityOfSelectedFruit <= 0) {
                        System.out.println("Fruit sold out");
                        break;
        
                    } else {
                        System.out.println("You selected: " + selectedFruit.getFruitName());
                        System.out.println("Please input quantity: ");
                        int inputFruitQuantity = validate.checkIntinput();

//                        int calculateFruitQuantity = quantityOfSelectedFruit - inputFruitQuantity;

                        if (inputFruitQuantity > quantityOfSelectedFruit) {

                            System.out.println("Out of order.");
                            System.out.println("Please enter another quantity. ");
                        } else {
                            
                            Fruit purchasedFruit = new Fruit(selectedFruit.getFruitID(), 
                                    selectedFruit.getFruitName(), selectedFruit.getFruitPrice(), 
                                    inputFruitQuantity, selectedFruit.getFruitOrigin());
                                    calculateRemainningFruit(fruitList, userInput, inputFruitQuantity);
                                    
                            fruitPurchasedList.add(purchasedFruit);
                            
                            calculateRemainningFruit(fruitList, userInput, inputFruitQuantity);
                            
                            System.out.println("Do you want to order now (Y/N)?");
                            String userChoice = validate.checkStringInput();
                            if (userChoice.equalsIgnoreCase("Y")) {
                                break;
                            } else if (!userChoice.equalsIgnoreCase("N")) {
                                System.out.println("Invalid input. Please enter valid input. ");
                            }
                        }
                    }
                }
            }
            
            if (!fruitPurchasedList.isEmpty()) {
                displayListOfPurchasedFruit(fruitPurchasedList, listOfCustomerOrder);
            }
        }

        public void displayListOfFruit(ArrayList<Fruit> fruitList) {
            System.out.println("List of Fruit");
            System.out.printf("|%-5s| |%-10s| |%-20s| |%-25s|\n", "++Item++", "++FruitName++", "++Origin++", "++Price++");
            for (Fruit fruit : fruitList)  {
                  System.out.printf("|%-5s| |%-10s| |%-20s| |%-25s|\n"
                            , fruit.getFruitID(),fruit.getFruitName(), fruit.getFruitOrigin(), fruit.getFruitPrice() + "$");
            }
        }

        public void displayListOfPurchasedFruit(ArrayList<Fruit> fruitPurchasedList, ArrayList<Order> listOfCustomerOrder) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", "Product |", " Quantity |", " Price |", " Amount");
            double total = 0;
            double amount;
            for (Fruit fruit : fruitPurchasedList) {
                amount = fruit.getFruitPrice() * fruit.getFruitQuantity();
                System.out.printf("%-10s %-10d %-10.2s %-10.2s\n", 
                            fruit.getFruitName(), fruit.getFruitQuantity(), fruit.getFruitPrice() + "$", amount + "$");

                total += amount;
            }
            System.out.println("Total: " + total + "$");
            System.out.println("Input your name : ");
            String customerName = validate.checkStringInput();
            
            Order order = new Order(customerName, fruitPurchasedList);
            listOfCustomerOrder.add(order);
            
            System.out.println("Successfully!");
        }
        
        
        public void displayOrder(ArrayList<Order> listOfCustomer) {
            for(Order order : listOfCustomer) {
                System.out.println("Customer: " + order.getCustomerName());
                System.out.printf("%-10s %-10s %-10s %-10s\n", "Product |", " Quantity |", " Price |", " Amount");
                double total = 0;
                
                for(Fruit fruit : order.getListPurchasedFruit()) {
                    double amount = fruit.getFruitQuantity() * fruit.getFruitPrice();
                    System.out.printf("%-10s %-10d %-10.2s %-10.2s\n", 
                            fruit.getFruitName(), fruit.getFruitQuantity(), fruit.getFruitPrice() + "$", amount + "$");

                total += amount;
                }
                System.out.println("");
                System.out.println("Total: " + total + "$");
            }
        }
    }
