package com.btcag.bootcamp;

import java.util.Scanner;

public class Sortieren {
    public static void main(String[] args) {
        while (1 == 1) {
            int[] array = {7, 5, 4, 6, 9, 8, 1, 2, 3, 10};
            int tmp = array[0]++;
            int tmp2 = array[1]++;
            if (tmp < tmp2) {
                int[] arrayNext = {tmp, tmp2};
                System.out.println(arrayNext[1]);
            }

        }
    }
}
