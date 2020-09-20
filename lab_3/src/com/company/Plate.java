package com.company;

public class Plate extends Dish {
    public Plate()
    {
        setBroken(false);
        setColor("Default");
        setSize("For dinner");
    }

    public void take() {
        System.out.println("Ow, i'm got a plate!");
    }

    public void wash() {
        System.out.println("I'm washing a plate!");
    }
}
