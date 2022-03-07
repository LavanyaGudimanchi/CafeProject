package com.perscholas.cafe;


import java.sql.SQLOutput;
import java.util.Scanner;


//Testing for Branch in github
public class CafeApp {
    public static void main(String[] args) {
        // write your code here

        ShoppingCort mycart = new ShoppingCort();
        //Display Menu

        while(true)
        {
            Store.DisplayMenu();
            // Take input
            Scanner inp = new Scanner(System.in);
            int a =inp.nextInt();
            switch (a)
            {
                case 1:
                {
                    Coffee coffee = new Coffee("Coffee", 20.50, "Coffee Maxim");
                    coffee.CaptureQuantity();
                    coffee.AddOptions();
                    mycart.AddProduct(coffee);
                    break;
                }
                case 2:
                {
                    Cappuccino cappuccino = new Cappuccino("Cappuccino", 30, "Cappuccino Extra special");
                    cappuccino.CaptureQuantity();
                    cappuccino.AddOptions();
                    mycart.AddProduct(cappuccino);
                    break;
                }
                case 3:
                {
                    Espresso espresso = new Espresso("Espresso", 25.5, "Espresso special Coffee");
                    espresso.CaptureQuantity();
                    espresso.AddOptions();
                    mycart.AddProduct(espresso);
                    break;
                }
                case 4:
                {
                    mycart.Display();
                    break;
                }
                default :
                {
                    System.out.println("Please choose Numbers between 1 and 4");
                }

            }
            if (a == 4)
            {
                break;
            }
        }





    }




}