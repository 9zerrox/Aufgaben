package com.btcag.bootcamp;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte string eingeben: ");
        String s = scanner.nextLine();
        String uppercase = s.toUpperCase();
        System.out.println(uppercase);
    }
}
