package com.btcag.bootcamp;

import java.util.Scanner;

public class ImmerPositiv {
    public static void main(String[] args) {
 /*       Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 0) {
            int n = i * -1;
            System.out.println(n);
        } else {
            System.out.println(i);
        }
    }
*/
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        while (n < 0) {
            n++;
            i++;
            int result = i+n;
            System.out.println(result);
        }
        System.out.println(n);
    }
}

