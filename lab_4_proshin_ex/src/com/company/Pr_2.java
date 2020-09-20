package com.company;

public class Pr_2 implements Priceable{
    public double price;
    public boolean isSold;
    public boolean isSale;
    public String color;

    public Pr_2()
    {
        price = 1000;
        isSold = false;
        isSale = true;
        color = "Black";
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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
