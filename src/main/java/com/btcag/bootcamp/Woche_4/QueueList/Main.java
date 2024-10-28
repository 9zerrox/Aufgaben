package com.btcag.bootcamp.Woche_4.QueueList;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println(
                "1: gibt das erste Element zurück und löscht dieses von den Daten \n" +
                "2: gibt das letzte Element zurück und entfernt dieses von den Daten \n" +
                "3: fügt dieses Element den Daten am Ende hinzu \n" +
                "4: fügt dieses Element den Daten am Anfang hinzu \n" +
                "5: gibt an Stelle i das Element zurück, entfernt es aber nicht \n");

        QueueList list = new QueueList();

        Scanner readIn = new Scanner(System.in);
        int select = readIn.nextInt();
        int i = readIn.nextInt();

        if (select == 1){
            list.popFront();
            System.out.println("Das Element " + i + "wurde entfernt");
        }

        else if (select == 2) {
            list.popLast();
            System.out.println("Das Element " + i + "wurde entfernt");
        }

        else if (select == 3) {
            list.pushFront();
            System.out.println("Das Element " + i + "wurde hinzugefügt");
        }

        else if (select == 4) {
            list.pushLast();
            System.out.println("Das Element " + i + "wurde hinzugefügt");
        }

        else if (select == 5) {
            list.get(i);
            System.out.println(i);
        }
    }
}
