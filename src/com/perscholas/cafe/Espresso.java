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

    public Espresso(String name, double price, String description) {
        super(name,price,description);
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

    @Override
    void AddOptions() {
        System.out.println("Do you want to add PepperMint: ");
        this.setPeppermint(this.gettinginput());
        System.out.println("Do you want to add WhippedCream: ");
        this.setWhippedCream(this.gettinginput());
    }

    @Override
    void PrintOptions() {
        System.out.print("Peppermint:" + isPeppermint()+"\t");
        System.out.print("WhippedCream:" + isWhippedCream()+"\n");
    }


}
