package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product {

    private boolean Sugar;
    private boolean Milk;

    public Coffee() {
        this.Milk = false;
        this.Sugar = false;
    }

    public Coffee(String name, double price, String description, boolean Sugar, boolean Milk) {
        super(name, price, description);
        this.Milk = Milk;
        this.Sugar = Sugar;

    }

    public boolean isSugar() {
        return Sugar;
    }

    public void setSugar(boolean sugar) {
        Sugar = sugar;
    }

    public boolean isMilk() {
        return Milk;
    }

    public void setMilk(boolean milk) {
        Milk = milk;
    }

    @Override
    double calculateProductTotal() {

        return getQuantity() * getPrice();
    }


}
