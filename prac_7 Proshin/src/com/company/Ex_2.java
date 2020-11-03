package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex_2 {

    Queue<Integer> player1 = new LinkedList<Integer>();
    Queue<Integer> player1Temp = new LinkedList<Integer>();
    Queue<Integer> player2 = new LinkedList<Integer>();
    Queue<Integer> player2Temp = new LinkedList<Integer>();

    Scanner scanner = new Scanner(System.in);

    Ex_2 (){

        for (int i = 0 ; i < 5 ; i++)
            player1Temp.add(scanner.nextInt());
        for (int i = 0 ; i < 5 ; i++)
            player1.add(player1Temp.poll());


        for (int i = 0 ; i < 5 ; i++)
            player2Temp.add(scanner.nextInt());
        for (int i = 0 ; i < 5 ; i++)
            player2.add(player2Temp.poll());

        game(player1,player2);

    }

    public static void game(Queue<Integer> player1, Queue<Integer> player2) {

        int cicle = 1;

        while (cicle != 106) {

            if (player1.peek()==null)
            {
                System.out.println("second " + cicle);
                return;
            }
            else if (player2.peek()==null)
            {
                System.out.println("first " + cicle);
                return;
            }
            if (player1.peek()<player2.peek() || player2.peek() == 0 && player1.peek() == 9) {
                player2.add(player2.poll());
                player2.add(player1.poll());
            }
            else if (player1.peek()>player2.peek() || player1.peek() == 0 && player2.peek() == 9) {
                player1.add(player1.poll());
                player1.add(player2.poll());
            }
            cicle += 1;
        }

        System.out.println("botva");

    }

}
