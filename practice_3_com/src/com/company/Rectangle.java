package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        width = 2;
        length = 2;
        this.color = "Default";
        this.filled = false;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "Default";
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }
    public String toString()
    {
        return "Hello It's Rectangle Style!!!!!";
    }
}
