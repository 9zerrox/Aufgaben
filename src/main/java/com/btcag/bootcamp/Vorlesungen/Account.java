package com.btcag.bootcamp.Vorlesungen;

public class Account {
    protected int saldo;
    private Address address;

    Account(int saldo, Address address) {
        this.saldo = saldo;
        this.address = address;
    }

    public int cashIn(int amount){
        this.saldo += amount;
        return this.saldo;
    }

    public int cashOut(int amount){
        this.saldo -= amount;
        return this.saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public Address getAddress(){
        Address addressCp = new Address();
        addressCp.street = this.address.street;
        addressCp.postalcode = this.address.postalcode;
        addressCp.housenum = this.address.housenum;
        return addressCp;
    }

    public static void main(String[] args){
        Address address = new Address();
        address.housenum = 2;
        address.postalcode = 41477;
        address.street = "Mauerbachstr.";

        Address newaddress = null;

        Account[] accs = new Account[123];


        int[] xyz = new int[123123];
        xyz = null;

        Account account = new Account(10, address);

        Address a = account.getAddress();
        Address a2 = account.getAddress();

        System.out.println("1Street" + a.street);

        a.street = "HACK!";

        System.out.println("2Street"+ a.street);
        System.out.println("3Street"+a2.street);
    }
}
