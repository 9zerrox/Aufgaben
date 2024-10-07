package com.btcag.bootcamp;

import java.util.Objects;
import java.util.Scanner;

public class fourconnects {
    public static Boolean winner;
    public static Boolean loser;
    public static Boolean state;
    public static String username = "";
    public static String password = "";
    public static Scanner readIn = new Scanner(System.in);


    public static void main(String[] args) {
       /* welcomePlayer();
        registration();
        login(); */
        playField();
        //result(winner, loser);
    }

    /* gewonnen, verloren oder unentschieden */

    public static void result(boolean winner, boolean loser) {
        if (winner) {
            System.out.println("Herzlichen Glückwunsch, du hast gewonnen!");
        } else if (loser) {
            System.out.println("Schade, vielleicht beim nächsten mal!");
        } else {
            System.out.println("Es scheint sich um ein unentschieden zu handeln.");
        }
    }

    public static void welcomePlayer() {
        do {
            System.out.println("Willkommen bei 4Gewinnt, (yes) um fortzufahren.");
            String input = readIn.nextLine();
            if (Objects.equals(input, "yes")) {
                state = false;
            } else if (Objects.equals(input, "Yes")) {
                state = false;
            }
        }
        while (state);
    }

    /* Spieler kann sich einen "account" erstellen. */

    public static void registration() {
        do {
            System.out.println("Bitte gebe dein username an: \n");
            username = readIn.nextLine();
            System.out.println("Bitte gebe dein passwort an: \n");
            password = readIn.nextLine();
        }
        while (username.length() > 8);
    }

    public static void login() {
        String usernameCheck;
        String passwordCheck;
        do {
            System.out.println("Bitte gebe deine Daten an: ");
            usernameCheck = readIn.nextLine();
            passwordCheck = readIn.nextLine();
        }
        while (!usernameCheck.equals(username) && !passwordCheck.equals(password));
    }

    /* Spielfeld wird erstellt */

    public static void playField() {
        String field = "[ ]";
        String chipRed = "[x]";
        String chipBlue = "[o]";
        int rows = 6;
        int columns = 7;

        String[][] playfield = new String[rows][columns];

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

        System.out.print(" 1   2   3   4   5   6   7");
    }

    /* benutzer kann einen spielzug machen */

    public static void userMove() {
        System.out.println("Bitte mache deinen ersten Zug: \n");
        int slot;
        do {
            slot = readIn.nextInt();
        }
        while (slot >= 8 && slot < 1);
    }
}