package com.perscholas.cafe;


import java.sql.SQLOutput;
import java.util.Scanner;


//Testing for Branch in github
public class CafeApp {
    public static void main(String[] args) {
        // write your code here
        Coffee coffee = new Coffee();
        coffee.setDescription("Coffee Maxim");
        coffee.setPrice(20.50);
        coffee.setName("Coffee");

        Espresso espresso = new Espresso();
        espresso.setDescription("Espresso special Coffee");
        espresso.setPrice(25.5);
        espresso.setName("Espresso");

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setDescription("Cappuccino Extra special");
        cappuccino.setPrice(30);
        cappuccino.setName("Cappuccino");

        //Taking order from the Customer
        System.out.println("Enter Coffee Quantity");
        Scanner input1 = new Scanner(System.in);
        coffee.setQuantity(input1.nextInt());
        System.out.println("Do you want to add Sugar?");
        coffee.setSugar(coffee.gettinginput());
        System.out.println("Do you want to add Milk?");
        coffee.setMilk(coffee.gettinginput());
        System.out.println("Name: " + coffee.getName());
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Coffee Quantity" + coffee.getQuantity());
        double productSubTotal = coffee.calculateProductTotal();
        System.out.println("Product Subtotal: " + productSubTotal);


        System.out.println("Enter Cappuccino Quantity: ");
        Scanner input2 = new Scanner(System.in);
        cappuccino.setQuantity(input2.nextInt());
        System.out.println("Do you want to add Extra Shot: ");
        cappuccino.setExtraShot(cappuccino.gettinginput());
        System.out.println("Do you want to add machiato: ");
        cappuccino.setMacchiato(cappuccino.gettinginput());
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getDescription());
        System.out.println(cappuccino.calculateProductTotal());

        System.out.println("Enter espresso Quantity: ");
        Scanner input3 = new Scanner(System.in);
        espresso.setQuantity(input3.nextInt());
        System.out.println("Do you want to add PepperMint: ");
        espresso.setPeppermint(espresso.gettinginput());
        System.out.println("Do you want to add WhippedCream: ");
        cappuccino.setMacchiato(cappuccino.gettinginput());
        System.out.println(espresso.getName());
        System.out.println(espresso.getDescription());
        System.out.println(espresso.calculateProductTotal());

        Double Subtotal = coffee.calculateProductTotal() + cappuccino.calculateProductTotal() + espresso.calculateProductTotal();
        System.out.println("Subtotal: " + Subtotal);
        double Salestax = Subtotal * .07;
        System.out.println("Sales tax: " + Salestax);
        double SalesTotal = Subtotal + Salestax;
        System.out.println("Sales Total: " + SalesTotal);


    }
}