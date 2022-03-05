package com.perscholas.cafe;

public class  Espresso extends Product{

    boolean peppermint;
    boolean whippedCream;

    public Espresso(){
        this.peppermint =false;
        this.whippedCream=false;}

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public Espresso(String name, double price, String description, boolean peppermint , boolean whippedCream) {
        super(name,price,description);
        this.peppermint =peppermint ;
        this.whippedCream=whippedCream;

    }


    @Override
    double calculateProductTotal() {
        double price;
        price=getPrice();
        if(peppermint )
            price=price+2;
        if(whippedCream)
            price = price+1;
        return  getQuantity()*price;

    }


}
