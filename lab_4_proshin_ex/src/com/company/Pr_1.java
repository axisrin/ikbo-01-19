package com.company;

public class Pr_1 implements Priceable {
    public double price;
    public boolean isSold;
    public boolean isSale;

    public Pr_1()
    {
        price = 599;
        isSold = false;
        isSale = true;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }

    public boolean isSale() {
        return isSale;
    }

    public double getPrice() {
        return price;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public boolean isSold() {
        return isSold;
    }
}
