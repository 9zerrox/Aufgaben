package com.btcag.bootcamp.Aufgabe_Woche_1;

import java.util.Scanner;

public class ASCIITriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine ganze Zahl ein: ");
        int number = scanner.nextInt();

        int i = 0;
        while (i <= number) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}