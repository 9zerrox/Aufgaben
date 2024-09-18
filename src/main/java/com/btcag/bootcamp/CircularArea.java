package com.btcag.bootcamp;

import java.util.Scanner;

public class CircularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine positive ganze Zahl ein:");
        int number = scanner.nextInt();
        float pi = 3.14F;
        float n = number*number;
        float result = pi * n;
        System.out.println("Der Kreis hat eine Fläche von " + result);
    }
}
