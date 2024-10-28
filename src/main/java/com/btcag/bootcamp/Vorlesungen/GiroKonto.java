package com.btcag.bootcamp.Vorlesungen;

public class GiroKonto extends Account {
    final static  double INTEREST = 0.02;

    int saldo = 2;


    GiroKonto(int saldo, Address address) {
        super(saldo, address);
    }

    public void yearEnd(){
        this.saldo = 12;
        super.saldo+= (int) (super.saldo * INTEREST);
    }
}
