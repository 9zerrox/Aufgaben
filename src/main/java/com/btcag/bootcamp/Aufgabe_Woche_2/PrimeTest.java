package com.btcag.bootcamp;

import java.util.Scanner;

// add all the digits in a number, if the sum is divisible by 3 it is not a prime number //

public class PrimeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Dynamische Variablen zur Speicherung der Ziffern
        int length = input.length();
        char[] digits = new char[length];

        // Ziffern in das Array speichern
        int i = 0;
        while (i < length) {
            digits[i] = input.charAt(i);
            i++;
        }

        // Ausgabe der Ziffern in einzelnen Variablen
        int j = 0;
        while (j < length) {
            System.out.println("char " + (j + 1) + " = " + digits[j]);
            j++;
        }

        int n = 0;
        while (n < 1){
       //     int sum = char
        }

    }
}
