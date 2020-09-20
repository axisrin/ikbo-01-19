package com.company;

import java.awt.print.Printable;

public class Main {

    public static void main(String[] args) {
        Pr_1 product = new Pr_1();
        System.out.println("Is product for Sale ? : " + product.isSale());
        System.out.println("Is product sold ? : " + product.isSold());
        System.out.println("Price : " + product.getPrice());

        Priceable product_2 = new Pr_2();
        System.out.println("Price second product : " + product_2.getPrice());

    }
}
