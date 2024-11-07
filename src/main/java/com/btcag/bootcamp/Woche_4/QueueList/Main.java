package com.btcag.bootcamp.Woche_4.QueueList;

import java.util.Arrays;
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

        System.out.println("So sieht das aktuelle Array aus: " + Arrays.toString(list.getArray()));

        Scanner readIn = new Scanner(System.in);
        int select = readIn.nextInt();


        if (select == 1){
            list.popFront();
            System.out.println("Das Element " + select + "wurde entfernt");
        }

        else if (select == 2) {
            list.popLast();
            System.out.println("Das Element " + select + " wurde entfernt");
            System.out.println("So sieht das neue Array aus: " + Arrays.toString(list.getArray()));
        }

        else if (select == 3) {
            int number = readIn.nextInt();
            list.pushFront(number);
            System.out.println("Das Element " + number + "wurde hinzugefügt");
            System.out.println("So sieht das neue Array aus: " + Arrays.toString(list.getArray()));
        }

        else if (select == 4) {
            int number = readIn.nextInt();
            list.pushLast(number);
            System.out.println("Das Element " + number + "wurde hinzugefügt");
            System.out.println("So sieht das neue Array aus: " + Arrays.toString(list.getArray()));
        }

        else if (select == 5) {
            list.get(select);
            System.out.println(select);
        }
    }
}
