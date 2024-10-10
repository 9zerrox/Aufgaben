package com.btcag.bootcamp;

import java.util.Scanner;

public class QuadratischeGleichungen {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Gebe a, b und c an: ");
        double a = readIn.nextDouble();
        double b = readIn.nextDouble();
        double c = readIn.nextDouble();

        double d = (b * b) - (4 * (a * c));

        if (d < 0){
            System.out.println("Keine (reelle) Lösung!" + d);
        }
        else if (d == 0){
            System.out.println("Eine Lösung!" + d);
        }
        else {
            System.out.println("Zwei Lösungen!" + d);
        }
    }
}
