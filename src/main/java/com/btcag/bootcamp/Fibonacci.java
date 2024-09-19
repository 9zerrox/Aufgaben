package com.btcag.bootcamp;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
        int n = scanner.nextInt();

        int i = 0;
        int j = 1;

        System.out.println("Das Ergebnis lautet: "+ i);

        while (j < n){
            System.out.println(j);
            int c = j;
            j = i + j;
            i = c;
        }
    }
}
