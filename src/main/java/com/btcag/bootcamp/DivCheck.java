package com.btcag.bootcamp;

import java.util.Scanner;

public class DivCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib eine positive ganze Zahl ein:");
        int divisor = scanner.nextInt();

        System.out.println("Bitte gib eine positive ganze Zahl ein:");
        int maxnumber = scanner.nextInt();

        int result = 0;

        while (result < maxnumber){
            System.out.println(result);
            result += divisor;
        }
    }
}
