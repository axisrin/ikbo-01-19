package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Please sign N : ");
        n = scn.nextInt();
        System.out.println("Total of number is = " + recurseFindSummaryOfN(n,0));

    }

    // Поиск суммы чисел в числе
    public static int recurseFindSummaryOfN(int n,int tempSum)
    {
        int tempn;
        // Условие Выхода
        if (n == 0)
            return 0;
        tempn = n%10;
        n = n/10;
        // Шаг Рекурсии
        tempSum = tempSum + tempn;
        tempSum = tempSum + recurseFindSummaryOfN(n,0);
        return tempSum;
    }

}
