package com.company;

public class Circle extends Shape {
    protected double radius;
    public Circle()
    {
        radius = 10;
        super.color = "Default";
        super.filled = false;
    }
    public Circle (double radius)
    {
        this.radius = radius;
        super.color = "Default";
        super.filled = false;
    }
    public Circle (double radius,String color,boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String toString()
    {
        return "Hello It's Circle Style!!!";
    }
}
