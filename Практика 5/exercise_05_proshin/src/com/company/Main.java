package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Write the K : ");
        Scanner scanner = new Scanner(System.in);

        double k = scanner.nextInt();
        k = Math.pow(10,k)/10;
        int kNew = (int)k;
        System.out.println("Write the S : ");
        int s = scanner.nextInt();

        System.out.println("The total numbers are : " + recurseFindTotalNumbers(kNew,kNew,s,0));

    }

    public static int recurseFindTotalNumbers(int firstK,int k,int s, int sum) {
        //Условие выхода
        if (k / firstK == 10)
            return sum;

        int flag;
        flag = recurseFindSummaryOfK(k,0);
        //Шаг рекусрии
        if (flag == s)
            sum = sum + 1;

        //Возврат значения
        return sum = recurseFindTotalNumbers(firstK,k+1,s,sum);

    }

    // Поиск суммы чисел в числе
    public static int recurseFindSummaryOfK(int k,int tempSum)
    {
        int tempK;
        // Условие Выхода
        if (k == 0)
            return 0;
        tempK = k%10;
        k = k/10;
        // Шаг Рекурсии
        tempSum = tempSum + tempK;
        tempSum = tempSum + recurseFindSummaryOfK(k,0);
        return tempSum;
    }
}
