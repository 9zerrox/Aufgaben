package com.btcag.bootcamp.Woche_4.QueueList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QueueList list = new QueueList();
        while (true) {


            System.out.println(
                    "1: gibt das erste Element zurück und löscht dieses von den Daten \n" +
                            "2: gibt das letzte Element zurück und entfernt dieses von den Daten \n" +
                            "3: fügt dieses Element den Daten am Anfang hinzu \n" +
                            "4: fügt dieses Element den Daten am Ende hinzu \n" +
                            "5: gibt an Stelle i das Element zurück, entfernt es aber nicht \n");


            Scanner readIn = new Scanner(System.in);



            System.out.println("So sieht das aktuelle Array aus: " + list);


            int select = readIn.nextInt();


            if (select == 1) {
                list.popFront();
                System.out.println("Das Element 1 wurde entfernt");
            } else if (select == 2) {
                list.popLast();
                System.out.println("Das Element 5 wurde entfernt");
            } else if (select == 3) {
                int number = readIn.nextInt();
                list.pushFront(number);
                System.out.println("Das Element " + number + "wurde hinzugefügt");
            } else if (select == 4) {
                int number = readIn.nextInt();
                list.pushLast(number);
                System.out.println("Das Element " + number + "wurde hinzugefügt");
            } else if (select == 5) {
                System.out.println("Welche stelle möchtest du sehen?");
                int number = readIn.nextInt();
                list.get(number);
            }

            System.out.println("So sieht das neue Array aus: " + list);
        }
    }
}