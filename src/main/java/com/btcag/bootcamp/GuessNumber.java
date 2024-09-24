package com.btcag.bootcamp;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl an: ");
        int number = scanner.nextInt();
        int versuch = 1;

        Random random = new Random();
        long val = random.nextLong(15);

        while (number != val) {
            System.out.println(versuch + " Versuch: Bitte eine Zahl im Bereich 0 und 15 angeben: ");
            number = scanner.nextInt();
            versuch++;
            while (val > number){
                System.out.println("Die gesuchte Zahl ist größer!");
                break;
            }
            while (val < number){
                System.out.println("Die gesuchte Zahl ist kleiner!");
                break;
            }
        }
        System.out.println("Gut gemacht, du hast die Zahl gefunden!!!");

    }
}
