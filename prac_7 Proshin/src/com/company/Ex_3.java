package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex_3 {

    Deque<Integer> player1 = new LinkedList<>();
    Deque<Integer> player2 = new LinkedList<>();

    Scanner scanner = new Scanner(System.in);

    public Ex_3() {

        for (int i = 0; i < 5;i++) {

            player1.offerLast(scanner.nextInt());

        }

        for (int i = 0; i < 5; i++) {

            player2.offerLast(scanner.nextInt());

        }

        /*for (int i = 0; i < 5; i++) {

            System.out.println(player1.pollFirst() + " " + player2.pollFirst());

        }*/

        game(player1,player2);

    }

    public static void game(Deque<Integer> player1, Deque<Integer> player2) {

        int cicles = 0;

        while (cicles != 106)
        {

            if (player1.peek()==null) {
                System.out.println("second " + cicles);
                return;
            }
            else if (player2.peek()==null) {
                System.out.println("first " + cicles);
                return;
            }
            else if (player1.peekFirst()==0 && player2.peekFirst()==9) {

                player1.offerLast(player1.pollFirst());
                player1.offerLast(player2.pollFirst());
                cicles = cicles +1;
            }
            else if (player2.peekFirst()==0 && player1.peekFirst()==9) {

                player2.offerLast(player2.pollFirst());
                player2.offerLast(player1.pollFirst());
                cicles = cicles +1;
            }
            else if (player2.peekFirst() < player1.peekFirst()) {

                player1.offerLast(player1.pollFirst());
                player1.offerLast(player2.pollFirst());
                cicles = cicles +1;
            }
            else if (player1.peekFirst() < player2.peekFirst()) {

                player2.offerLast(player2.pollFirst());
                player2.offerLast(player1.pollFirst());
                cicles += 1;
            }


        }

        System.out.println("botva");

    }

}