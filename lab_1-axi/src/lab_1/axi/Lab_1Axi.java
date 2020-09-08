/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1.axi;

import java.util.Scanner;

public class Lab_1Axi {

    
    public static void main(String[] args) {
       int[] b = new int [10];
       Scanner sc = new Scanner(System.in);
       for (int i = 0;i<10;i++)
       {
           b[i] = sc.nextInt();
       }
       int sum = 0;
        for (int i = 0;i<10;i++)
       {
           sum = sum + b[i];
       }
       System.out.println("For summ = " + sum);
       int i = 0;
       sum = 0;
       while (i!=10)
       {
           sum = sum + b[i];
           i++;
       }
       System.out.println("For summ = " + sum);
       i = 0;
       sum = 0;
       do
       {
           sum = sum + b[i];
           i++;
       }while(i!=10);
       System.out.println("For summ = " + sum);
       
       
    }
    
}
