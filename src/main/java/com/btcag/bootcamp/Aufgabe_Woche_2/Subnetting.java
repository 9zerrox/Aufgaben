package com.btcag.bootcamp.Aufgabe_Woche_2;

import java.util.Scanner;

public class Subnetting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe das 1. Oktett der IP Adresse an: ");

        long oktett1 = scanner.nextLong();
        System.out.println("Bitte gebe das 2.  Oktett der IP Adresse an: ");

        long oktett2 = scanner.nextLong();
        System.out.println("Bitte gebe das 3. Oktett der IP Adresse an: ");

        long oktett3 = scanner.nextLong();
        System.out.println("Bitte gebe das 4. Oktett der IP Adresse an: ");

        long oktett4 = scanner.nextLong();
        System.out.println("Bitte gebe die Subnetzmaske an: ");

        long bits = scanner.nextLong();

        long Bitss = 32 - bits;

        long viertesOktettNetzadresse = (oktett4 >> Bitss) << Bitss;

        long viertesOktettBroadcast = viertesOktettNetzadresse + (1 << Bitss) - 1;

        System.out.println("Die Netzadresse ist: " + oktett1 + "." + oktett2 + "." + oktett3 + "." + viertesOktettNetzadresse);

        System.out.println("Die Broadcastadresse ist: " + oktett1 + "." + oktett2 + "." + oktett3 + "." + viertesOktettBroadcast);
    }
}