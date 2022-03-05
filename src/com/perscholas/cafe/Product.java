package com.perscholas.cafe;

import java.util.Scanner;

public abstract class Product {
    private String name;
    private double price;
    private String description;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract double calculateProductTotal() ;

    public boolean gettinginput() {

        boolean yn;
        while (true) {
            System.out.println("y/n");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                yn = true;
                break;
            } else if (answer.equals("n")) {
                yn = false;
                break;
            } else
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
        }
        return yn;
    }


}
