package com.company;

import java.util.ArrayList;

public class TestArrayList {

    ArrayList<String> arrayList = new ArrayList<String>();
    ArrayList<String> arrayList1 = new ArrayList<String>();

    public TestArrayList() {

        arrayList.add("Ohaio");
        arrayList.add("Florencia");
        arrayList.add("Saint-Peterbourgh");

        System.out.println(arrayList.subList(0,arrayList.toArray().length));

        arrayList.add(2,"Moscow");

        System.out.println(arrayList.subList(0,arrayList.toArray().length));

        arrayList.set(1,"Tokyo");

        System.out.println(arrayList.subList(0,arrayList.toArray().length));

        arrayList1.add("Oklahoma");
        arrayList1.add("Syan-Bei");

        System.out.println(arrayList1.subList(0,arrayList1.toArray().length));


        arrayList.addAll(2, arrayList1);

        System.out.println(arrayList.subList(0,arrayList.toArray().length));

        System.out.println(arrayList.get(3) + " is object for index 3");

        System.out.println("Index of Moscow " + arrayList.indexOf("Moscow"));

        arrayList.sort(String::compareTo);

        System.out.println(arrayList.subList(0,arrayList.toArray().length));


    }

}
