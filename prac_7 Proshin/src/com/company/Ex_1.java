package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Ex_1 {

    Scanner scanner = new Scanner(System.in);

    private Stack<Integer> player1 = new Stack<Integer>();
    private Stack<Integer> player2 = new Stack<Integer>();


    public Ex_1 (){

        System.out.println("Vse Karty Neodinakoviye");

        for (int i = 0; i < 5; i++) {
            player1.push(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            player2.push(scanner.nextInt());
        }

        game(player1,player2);

    }


    public static void game(Stack<Integer> player1,Stack<Integer> player2)
    {

        Stack<Integer> player1Temp = new Stack<Integer>();
        Stack<Integer> player2Temp = new Stack<Integer>();

        int cicle = 1;

        while (cicle != 106) {

            if ((player1.empty()) && !player1Temp.empty())
                player1 = player1Temp;
            if ((player2.empty()) && !player2Temp.empty())
                player2 = player2Temp;
            if (player1.empty() && player1Temp.empty())
            {
                System.out.println("second " + cicle);
                return;
            }
            else if (player2.empty() && player2Temp.empty())
            {
                System.out.println("first " + cicle);
                return;
            }
            if (player1.peek()<player2.peek() || player2.peek() == 0 && player1.peek() == 9) {
                player2Temp.push(player1.pop());
                player2Temp.push(player2.pop());
            }
            else if (player1.peek()>player2.peek() || player1.peek() == 0 && player2.peek() == 9) {
                player1Temp.push(player2.pop());
                player1Temp.push(player1.pop());
            }

            cicle += 1;
        }

        System.out.println("botva");

    }

}
