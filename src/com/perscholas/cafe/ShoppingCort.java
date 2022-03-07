package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCort {
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void AddProduct(Product obj)
    {
        products.add(obj);
    }

    public  double  GetCount()
    {
        return products.stream().count();
    }

    public void Display()
    {
        double Subtotal = 0.0;
        for (Product obj: products)
        {
            obj.DisplayProdcutInfo();
            obj.PrintOptions();
            Subtotal +=  obj.calculateProductTotal();
        }
        System.out.println("Subtotal: " + Subtotal);
        double Salestax = Subtotal * .07;
        double SalesTotal = Subtotal + Salestax;
        System.out.printf("Sales tax: %5.2f \t Sales Total: %5.2f", Salestax, SalesTotal);



    }
}
