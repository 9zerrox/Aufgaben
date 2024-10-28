package com.btcag.bootcamp.Aufgabe_Woche_2;

import java.util.Scanner;

public class UnknownProgram {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Wert 1: ");
        long value1 = readIn.nextLong();
        System.out.println("Wert 2: ");
        long value2 = readIn.nextLong();

        long result = 0;
        while (value1-- > 0) { /* während value1 -1 größer als 0 ist wird die nächste Schleife ausgeführt. */
            long tmp = value2;
            while (tmp-- > 0) { /* während value2 -1 größer ist als 0 wird die schleife ausgeführt */
                result += 1;
            }
        }
        System.out.println("Result: " + result);
    }
}

/* Das Programm lässt als erstes value2 solange durchlaufen bis es kleiner als 0 ist, danach läuft jedoch noch einmal
die erste Schleife Value1 solange bis sie 0 ist. Das Heißt bei Value1 = 10 und Value2 = 20 ergibt das Programm 200.
 */