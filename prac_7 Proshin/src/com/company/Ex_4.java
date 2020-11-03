package com.company;



import java.util.Scanner;

public class Ex_4 {

    DoublyLinkedList<Integer> player1 = new DoublyLinkedList<Integer>();
    DoublyLinkedList<Integer> player2 = new DoublyLinkedList<Integer>();

    Scanner scanner = new Scanner(System.in);

    public Ex_4() {

        for (int i = 0 ; i < 5 ; i ++) {

            player1.addEnd(scanner.nextInt());

        }

        for (int i = 0 ; i < 5 ; i ++) {

            player2.addEnd(scanner.nextInt());

        }

        game(player1,player2);

    }

    public static void game(DoublyLinkedList<Integer> player1, DoublyLinkedList<Integer> player2) {

        int cicles = 0;

        while (cicles != 106) {

            if (!player1.haveCards()) {
                System.out.println("second " + cicles);
                return;
            }
            else if (!player2.haveCards()) {
                System.out.println("first " + cicles);
                return;
            }
            else if (player1.getCard() == 0 && player2.getCard() == 9) {
                player1.addEnd(player1.getCard());
                player1.addEnd(player2.getCard());
                player1.remove(player1.getCard());
                player2.remove(player2.getCard());
            }
            else if (player2.getCard() == 0 && player1.getCard() == 9) {
                player2.addEnd(player2.getCard());
                player2.addEnd(player1.getCard());
                player1.remove(player1.getCard());
                player2.remove(player2.getCard());
            }
            else if (player1.getCard() > player2.getCard()) {
                player1.addEnd(player1.getCard());
                player1.addEnd(player2.getCard());
                player1.remove(player1.getCard());
                player2.remove(player2.getCard());
            }
            else if (player2.getCard() > player1.getCard()) {
                player2.addEnd(player2.getCard());
                player2.addEnd(player1.getCard());
                player1.remove(player1.getCard());
                player2.remove(player2.getCard());
            }

            cicles += 1;

        }

        System.out.println("botva");

    }

}
