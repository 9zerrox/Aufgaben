package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIHourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Groesse einer Sanduhr haelfte: ");
        int number = scanner.nextInt();

        int i = number;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}