package com.btcag.bootcamp;

import java.util.Scanner;

public class Backward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben:");
        int number = scanner.nextInt();
        int result = 0;
        while (number != 0) {
            int zahl = number % 10;
            result = result * 10 + zahl;
            number /= 10;
        }
        System.out.println("Rückwärts: " + result);
    }
}

