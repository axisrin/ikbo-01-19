package com.company;

public class Main {

    public static void main(String[] args) {
    Rectangle figure_obj_1 = new Rectangle(10,5,"Blue",true);
    System.out.println("Color is " + figure_obj_1.getColor());
    System.out.println("Filled is " +figure_obj_1.isFilled());
    System.out.println("Length is " +figure_obj_1.getLength());
    System.out.println("Width is " +figure_obj_1.getWidth());
    System.out.println(figure_obj_1.toString());
    }
}
