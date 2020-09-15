package com.company;

public class Square extends Rectangle {
    public Square()
    {
        this.color = "Default";
        this.filled = false;
        this.length = 10;
        this.width = this.length;
    }
    public Square(double side)
    {
        this.length = side;
        this.width = side;
        this.color = "Default";
        this.filled = false;
    }
    public Square(double side,String color,boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return length;
    }
    public void setSide(double side)
    {
        length = side;
        width = side;
    }
    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }
    public void setLength(double side)
    {
        this.length = side;
        this.width = side;
    }
    public String toString()
    {
        return "Hello It's Square Style!!!!!!";
    }
}
