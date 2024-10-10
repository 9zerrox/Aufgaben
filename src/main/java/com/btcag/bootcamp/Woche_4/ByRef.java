package com.btcag.bootcamp.Woche_4;

import java.util.Scanner;

public class ByRef {
    public static Scanner readIn = new Scanner(System.in);
    public static int i = readIn.nextInt();

    public static void main(String[] args) {
            doubleValue();
    }

    public static void doubleValue() {
            i = i * 2;
            System.out.println(i);
    }
}

