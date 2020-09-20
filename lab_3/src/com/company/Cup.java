package com.company;

public class Cup extends Dish {
    public Cup()
    {
        setColor("Default");
        setBroken(false);
        setSize("Tea Cup");
    }

    public void take() {
        System.out.println("Ow, i'm got a tea cup!");
    }

    public void wash() {
        System.out.println("I'm Washing a cup!");
    }
}
