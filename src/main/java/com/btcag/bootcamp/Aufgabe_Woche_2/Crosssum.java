package com.btcag.bootcamp.Aufgabe_Woche_2;

import java.util.Scanner;

public class Crosssum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (Long): ");
        int zahl = scanner.nextInt();
        int result = 0;
        while (zahl != 0) {
            result += zahl % 10;
            zahl /= 10;
        }
        System.out.println(result);
    }
}

