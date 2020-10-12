package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Sign the num : ");
        Scanner scn = new Scanner(System.in);
        flagOfFindingRealNumber(scn.nextInt());
    }

    public static boolean flagOfFindingRealNumber(int k)
    {
        double newK;
        newK = (double)k;
        return findRealNumber(k,(int)(Math.sqrt(newK)));
    }

    public static boolean findRealNumber(int k , int newK)
    {
        if(newK == 1) {
            System.out.println("YES");
            return true;
        }
        else if(k%newK==0) {
            System.out.println("NO");
            return false;
        }
        else if(k%newK != 0)
            return  findRealNumber(k,newK-1);

        return true;
    }


}
