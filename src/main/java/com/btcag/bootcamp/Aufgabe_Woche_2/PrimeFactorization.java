package com.btcag.bootcamp.Aufgabe_Woche_2;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein: ");
        long zahl = scanner.nextLong();
        long teiler = 2;
        while (zahl >1){
            while (zahl % teiler == 0){
                System.out.print(teiler + " ");
                zahl = zahl / teiler;
            }
            teiler++;
        }
    }
}
