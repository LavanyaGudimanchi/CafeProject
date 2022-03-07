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

    public Cappuccino(String name, double price, String description) {
        super(name,price,description);

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

    @Override
    void PrintOptions() {
        System.out.print("ExtraShot:" + isExtraShot()+"\t");
        System.out.print("Macchiato:" + isMacchiato()+ "\n");
    }

    @Override
    void AddOptions() {
        System.out.println("Do you want to add Extra Shot: ");
        this.setExtraShot(this.gettinginput());
        System.out.println("Do you want to add machiato: ");
        this.setMacchiato(this.gettinginput());
    }
}
