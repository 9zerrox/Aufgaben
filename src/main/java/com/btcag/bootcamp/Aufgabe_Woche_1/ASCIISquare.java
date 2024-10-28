package com.btcag.bootcamp.Aufgabe_Woche_1;

import java.util.Scanner;

public class ASCIISquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Groesse des Vierecks: ");
        int number = scanner.nextInt();
        int i = 0;
        while (i < number) {
            int j = 0;
            while (j < number) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }

    }
}
