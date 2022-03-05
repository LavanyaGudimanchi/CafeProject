package com.perscholas.cafe;


import java.util.Scanner;



public class CafeApp {
        public static void main (String[] args){
            // write your code here
            Product coffee = new Product();
            coffee.setDescription("Coffee with milk and Sugar");
            coffee.setPrice(20.50);
            coffee.setName("Coffee");
            Product espresso = new Product();
            espresso.setDescription("Espresso special Coffee");
            espresso.setPrice(25.5);
            espresso.setName("Espresso");
            Product cappuccino = new Product();
            cappuccino.setDescription("Cappuccino Extra special");
            cappuccino.setPrice(30);
            cappuccino.setName("Cappuccino");

            //Taking order from the Customer
            System.out.println("Enter Coffee Quantity");
            Scanner input1 = new Scanner(System.in);
            coffee.setQuantity(input1.nextInt());
            System.out.println(coffee.getName());
            System.out.println(coffee.getDescription());
            System.out.println(coffee.calculateProductTotal());

            System.out.println("Enter Cappuccino Quantity");
            Scanner input2 = new Scanner(System.in);
            cappuccino.setQuantity(input2.nextInt());
            System.out.println(cappuccino.getName());
            System.out.println(cappuccino.getDescription());
            System.out.println(cappuccino.calculateProductTotal());

            System.out.println("Enter espresso Quantity");
            Scanner input3 = new Scanner(System.in);
            espresso.setQuantity(input3.nextInt());
            System.out.println(espresso.getName());
            System.out.println(espresso.getDescription());
            System.out.println(espresso.calculateProductTotal());

           Double Subtotal= coffee.calculateProductTotal()+cappuccino.calculateProductTotal()+ espresso.calculateProductTotal();
            System.out.println("Subtotal: " + Subtotal);
          double   Salestax = Subtotal*.07d;
            System.out.println("Sales tax: " + Salestax);
           double  SalesTotal=Subtotal+Salestax;
            System.out.println("Sales Total: " + SalesTotal);






        }
    }