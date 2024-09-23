package com.btcag.bootcamp;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden:");
        long input = 0;
        long geld = 0;
            do{
                input = scanner.nextLong();
                geld += input;
            } while (input != 0);
        }
    }

