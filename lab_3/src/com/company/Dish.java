package com.company;

public abstract class Dish {
    private String color;
    private String size;
    private boolean isBroken;

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean getBroken()
    {
        return isBroken;
    }

    public abstract void wash();
    public abstract void take();
}
