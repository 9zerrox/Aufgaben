package com.btcag.bootcamp.Aufgabe_Woche_3;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden:");
        double input = -1;
        double geld = 0;
        while (input != 0) {
            input = scanner.nextDouble();
            geld += input;
            System.out.println(input);
        }
        double geuro = geld / 100;
        System.out.println(geld);
        System.out.println("Wieviel hat der Kunde gegeben (in Cent)?");
        double cent = scanner.nextDouble();
        System.out.println(cent);
        double euro = cent / 100;
        System.out.println(euro);
        System.out.println(geuro);

        int zweihundert = 200;
        int hundert = 100;
        int fünfzig = 50;
        int zwambo = 20;
        int zehner = 10;
        int fünf = 5;
        int zwei = 2;
        int eins = 1;
        double fünfzigcent = 0.5;
        double zwanzigcent = 0.20;
        double zehncent = 0.10;
        double fünfcent = 0.05;
        double zweicent = 0.02;
        double eincent = 0.01;

        double result = geuro - euro;
        System.out.println(result);

        boolean state = true;

        while (state) {

            while (result > zweihundert) {
                System.out.println("1x" + zweihundert);
            }
            while (result > hundert) {
                System.out.println("1x" + hundert);
            }
            while (result > fünfzig) {
                System.out.println("1x" + fünfzig);
            }
            while (result > zwambo) {
                System.out.println("1x" + zwambo);
            }
            while (result > zehner) {
                System.out.println("1x" + zehner);
            }
            while (result > fünf) {
                System.out.println("1x" + fünf);
            }
            while (result > zwei) {
                System.out.println("1x" + zwei);
            }
            while (result > eins) {
                System.out.println("1x" + eins);
            }
            while (result > fünfzigcent) {
                System.out.println("1x" + fünfzigcent);
            }
            while (result > zwanzigcent) {
                System.out.println("1x" + zwanzigcent);
            }
            while (result > zehncent) {
                System.out.println("1x" + zehncent);
            }
            while (result > fünfcent) {
                System.out.println("1x" + fünfcent);
            }
            while (result > zweicent) {
                System.out.println("1x" + zweicent);
            }
            while (result > eincent) {
                System.out.println("1x" + eincent);
            }
        }
    }
}

