package com.btcag.bootcamp;

import java.util.Scanner;

public class UnknownProgram {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Wert 1: ");
        long value1 = readIn.nextLong();
        System.out.println("Wert 2: ");
        long value2 = readIn.nextLong();

        long result = 0;
        while (value1-- >0){
            long tmp = value2;
            while (tmp-- >0){
                result += 1;
            }
        }
        System.out.println("Result: "+result);
    }
}
