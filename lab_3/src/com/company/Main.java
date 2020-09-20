package com.company;

public class Main {

    public static void main(String[] args) {
	Dish plate = new Plate();
	plate.take();
	plate.wash();

	Dish cup = new Cup();
	cup.wash();
	cup.take();
	System.out.println(cup.getColor());
    }
}
