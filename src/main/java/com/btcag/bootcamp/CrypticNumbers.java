package com.btcag.bootcamp;

import java.util.Scanner;

public class CrypticNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        int n = scanner.nextInt();
        System.out.println("Bitte Passwort (ZAHL) eingeben: ");
        int i = scanner.nextInt();

        int j = (n * i) * 2;
        System.out.println("Das verschlüsselte Passwort lautet: "+j);

        System.out.println("Bitte die Zahl eingeben: ");
        int c = scanner.nextInt();
        System.out.println("Bitte Passwort (ZAHL) eingeben: ");
        int p = scanner.nextInt();

        int r = ( c / p ) / 2;
        System.out.println("Das Passwort lautet: "+r);
    }
}