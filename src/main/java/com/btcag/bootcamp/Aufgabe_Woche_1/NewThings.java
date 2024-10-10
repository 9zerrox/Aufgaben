/* package com.btcag.bootcamp;

import java.util.Scanner;

public class NewThings {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        System.out.println(!a || !b);


       /* a   b   c   d

        0   0   1   0
        0   1   1   0
        0   1   0   0
        1   1   1   0
        1   0   0   0
        1   1   0   0
        1   0   1   0
        0   0   0   1
        0   0   1   0
        0   1   0   0
        1   0   0   0
        0   0   1   1
        0   1   1   1
        1   1   1   1
        1   0   0   1
        0   1   0   1

        (a && b) || c;
        (a && b) || (a && b);
        (a && b && c) || (b && d);

        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        int andereZahl = scanner.nextInt();

        if (zahl % 2 == 0 && andereZahl % 2 == 0){
            System.out.println("Die Zahl ist gerade");

        String [] items = {"Hammer"};
        System.out.print(args[0]);
        System.out.print(args[1]);
        System.out.print(args[2]);
        System.out.print(args[3]);

        String [] item = new String[10];
        item[0] = "Super";
        System.out.println(item[0]);
        String[] item = new String[10];
        for (int index = 0; index < item.length;index++){
            System.out.println(item[index]);
            item[index] = "" + index;

        String[] item = new String[10];
        for (int index = 0; index < item.length;index++){
            System.out.println(item[index]);

        String[] items = new String[15];
        System.out.println("ARRAY" + items.length);
        for (int i = 0; i < items.length; i++) {
            items[i] = "Item" + i;
        }

        for (String item : items) {
            System.out.println(item);
        }
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe einen Namen ein: ");
        String name = "";
        do {
            name = scanner.next();
            isValid = name.length() > 3 && name.length() <= 15;
            if (!isValid){
                System.out.println("Der Name darf min 3 Zeichen und max 15 Zeichen besitzen.");
            }
        }while (!isValid);

        System.out.println(name);
        String[] original = {"Apfel"};
        String[] veraendert = wortUmschreiben(original);

        System.out.println("Original" + original[0]);
        System.out.println("Verändert" + veraendert[0]);


        public static  String wortUmschreiben(String[] wort) {
            wort[0] = wort[0] + "Banane";
            return wort;
        }

    }
}
*/
