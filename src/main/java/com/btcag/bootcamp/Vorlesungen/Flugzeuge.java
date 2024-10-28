package com.btcag.bootcamp.Vorlesungen;

public abstract class Flugzeuge {
    protected String model;
    protected int ps;
    protected int vMax;

    public Flugzeuge(String model, int ps, int vMax){
        this.model = model;
        this.ps = ps;
        this.vMax = vMax;
    }
}
