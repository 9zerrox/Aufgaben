package com.btcag.bootcamp;

import java.util.Objects;
import java.util.Scanner;

public class VierGewinnt {
    public static Boolean winner;
    public static Boolean loser;
    public static Boolean state = true;
    public static String username = "";
    public static String password = "";
    public static Scanner readIn = new Scanner(System.in);
    public static String field = "[ ]";
    public static String chipRed = "[x]";
    public static String chipBlue = "[o]";
    public static int rows = 6;
    public static int columns = 7;
    public static String[][] playfield = new String[rows][columns];

    public static void main(String[] args) {
        welcomePlayer();
        registration();
        login();
        while (true){
        playField();
        userMoveRed();
        userMoveBlue();}
        //fullRow();
        //checkWinner();
        //result(winner, loser);
    }

    /* gewonnen, verloren oder unentschieden */

    public static boolean result(boolean winner) {
        if (winner) {
            System.out.println("Herzlichen Glückwunsch, du hast gewonnen!");
        } else if (loser) {
            System.out.println("Schade, vielleicht beim nächsten mal!");
        } else {
            System.out.println("Es scheint sich um ein unentschieden zu handeln.");
        }
        return winner;
    }

    public static void welcomePlayer() {
        do {
            System.out.println("Willkommen bei 4Gewinnt, (yes) um fortzufahren.");
            String input = readIn.nextLine();
            if (Objects.equals(input, "yes") || Objects.equals(input, "Yes")) {
                state = false;
            }
        } while (state);
    }

    /* Spieler kann sich einen "account" erstellen. */

    public static void registration() {
        do {
            System.out.println("Bitte gebe dein username an: ");
            username = readIn.nextLine();
            System.out.println("Bitte gebe dein passwort an: ");
            password = readIn.nextLine();
        } while (username.length() > 8 || password.length() > 8);
    }

    public static void login() {
        String usernameCheck;
        String passwordCheck;
        do {
            System.out.println("Bitte gebe deine Daten an: ");
            usernameCheck = readIn.nextLine();
            passwordCheck = readIn.nextLine();
        } while (!usernameCheck.equals(username) || !passwordCheck.equals(password));
    }

    /* Spielfeld wird erstellt */

    public static void playField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                playfield[i][j] = field;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(playfield[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print(" 1   2   3   4   5   6   7\n");
    }

    /* benutzer kann einen spielzug machen */

    public static void userMoveRed() {
        System.out.println("Bitte mache deinen ersten Zug: \n");
        int slot;
        do {
            slot = readIn.nextInt();
        } while (slot < 1 || slot > 7);

        slot--; //

        int j = rows - 1; // Start von der untersten Reihe
        while (j >= 0 && (playfield[j][slot].equals(chipRed) || playfield[j][slot].equals(chipBlue))) {
            j--;
        }

        if (j >= 0) {
            playfield[j][slot] = chipRed;
            System.out.println("playfield[" + j + "][" + slot + "] == \"[x]\"");
        } else {
            System.out.println("wähle einen anderen Slot.");
        }

        /* Ausgabe des aktualisierten Spielfelds */
         for (int i = 0; i < rows; i++) {
             for (int k = 0; k < columns; k++) {
                 System.out.print(playfield[i][k] + " ");
             }
             System.out.println();
         }
         System.out.print(" 1   2   3   4   5   6   7\n");
        }

    public static void userMoveBlue() {
            System.out.println("Bitte mache deinen ersten Zug: \n");
            int slot;
            do {
                slot = readIn.nextInt();
            } while (slot < 1 || slot > 7);

            slot--; //

            int j = rows - 1; // Start von der untersten Reihe
            while (j >= 0 && (playfield[j][slot].equals(chipBlue) || playfield[j][slot].equals(chipRed))) {
                j--;
            }

            if (j >= 0) {
                playfield[j][slot] = chipBlue;
                System.out.println("playfield[" + j + "][" + slot + "] == \"[o]\"");
            } else {
                System.out.println("wähle einen anderen Slot.");
            }

            /* Ausgabe des aktualisierten Spielfelds */
            for (int i = 0; i < rows; i++) {
                for (int k = 0; k < columns; k++) {
                    System.out.print(playfield[i][k] + " ");
                }
                System.out.println();
            }
            System.out.print(" 1   2   3   4   5   6   7\n");
        }


    public static void checkWinner(){

    }

    public static void fullRow(){

    }
}
