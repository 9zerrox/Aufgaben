package com.btcag.bootcamp;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine positive ganze Zahl ein:");
        int number = scanner.nextInt();

        Scanner secondscan = new Scanner(System.in);
        System.out.println("Gebe eine positive ganze Zahl ein:");
        int nextnumber = secondscan.nextInt();

        float result = number * nextnumber;

        System.out.println("Das Ergebnis lautet" + result);

        }
    }

