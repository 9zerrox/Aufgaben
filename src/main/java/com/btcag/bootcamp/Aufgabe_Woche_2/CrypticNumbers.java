package com.btcag.bootcamp.Aufgabe_Woche_2;

import java.util.Scanner;

public class CrypticNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        Long n = scanner.nextLong();
        System.out.println("Bitte Passwort (ZAHL) eingeben: ");
        Long i = scanner.nextLong();

        Long j = (n * i) * 2;
        System.out.println("Das verschlüsselte Passwort lautet: " + j);

        System.out.println("Bitte die Zahl eingeben: ");
        Long c = scanner.nextLong();
        System.out.println("Bitte Passwort (ZAHL) eingeben: ");
        Long p = scanner.nextLong();

        Long r = (c / p) / 2;
        System.out.println("Das Passwort lautet: " + r);
    }
}