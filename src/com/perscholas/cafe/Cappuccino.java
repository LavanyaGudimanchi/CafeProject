package com.perscholas.cafe;

public class Cappuccino extends Product {

    boolean extraShot;
    boolean macchiato;

    public Cappuccino(){
        this.extraShot=false;
        this.macchiato=false;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    public Cappuccino(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name,price,description);
        this.extraShot=extraShot;
        this.macchiato=macchiato;

    }


    @Override
    double calculateProductTotal() {
        double price;
        price=getPrice();
        if(extraShot)
            price=price+2;
        if(macchiato)
            price = price+1;
        return  getQuantity()*price;

    }
}
