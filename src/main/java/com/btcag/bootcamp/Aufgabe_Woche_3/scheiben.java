package com.btcag.bootcamp;

import java.util.Scanner;

public class scheiben {

    public static Scanner readIn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bitte gebe an, wie viele Etagen verschoben werden sollen: ");
        drawTowerHistory(readIn.nextInt(), "erstenStab","zweitenStab","drittenStab");
    }

    public static void drawTowerHistory(int etage, String ersterStab, String zweiterStab, String dritterStab){
        if (etage == 0){
            return;
        }
        drawTowerHistory(etage-1,ersterStab,dritterStab,zweiterStab);
        System.out.println("Bewege Scheibe auf Etage: "+etage+"vom: "+ersterStab+ "zum: "+zweiterStab);
        drawTowerHistory(etage-1, dritterStab, zweiterStab,ersterStab);
    }
}
