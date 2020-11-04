package com.company;

import java.util.LinkedList;

public class TestLinkedList {

    LinkedList<String> linkedList = new LinkedList<String>();

    public TestLinkedList() {

        linkedList.add("Murmansk");
        linkedList.add("Ekaterinburgh");

        System.out.println(linkedList.subList(0,linkedList.toArray().length));

        linkedList.addFirst("Moscow");

        System.out.println(linkedList.subList(0,linkedList.toArray().length));

        linkedList.addLast("Saint-Peterburgh");

        System.out.println(linkedList.subList(0,linkedList.toArray().length));

        System.out.println("First element is " + linkedList.getFirst() + " and last is " + linkedList.getLast());

        linkedList.pollFirst();
        linkedList.pollLast();

        System.out.println("After Deleting " + linkedList.subList(0,linkedList.toArray().length));

        linkedList.addLast("Mytischy");
        linkedList.addLast("Ufa");
        linkedList.addLast("Vladivastock");

        System.out.println("Before Sorting " + linkedList.subList(0,linkedList.toArray().length));

        linkedList.sort(String::compareTo);

        System.out.println("After Sorting " + linkedList.subList(0,linkedList.toArray().length));


    }

}
