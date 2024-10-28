package com.btcag.bootcamp.Aufgabe_Woche_3;

import java.util.Scanner;

public class Schaltjahre {
    public static void main(String[] args) {
        while (1 == 1) {
            Scanner readIn = new Scanner(System.in);
            int year = readIn.nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Es handelt sich um ein Schaltjahr!");
            } else {
                System.out.println("Es handelt sich um kein Schaltjahr!");
            }
        }
    }
}