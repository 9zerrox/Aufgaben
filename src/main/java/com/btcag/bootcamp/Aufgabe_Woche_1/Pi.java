package com.btcag.bootcamp.Aufgabe_Woche_1;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?");
        int n = scanner.nextInt();
        double pi = 0.0;
        int i = 0;

        while (i < n){
            pi += Math.pow(-1, i) / (2 * i + 1);
            i++;
        }

        pi *= 4;
        System.out.println("Annäherung nach "+n+" Iterationen: "+pi);


    }
}
