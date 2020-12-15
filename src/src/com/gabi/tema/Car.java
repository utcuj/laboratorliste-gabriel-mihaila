package com.gabi.tema;

public class Car {
    private String nume;
    private int anFabricatie;

    public Car(String nume, int anFabricatie) {
        this.nume = nume;
        this.anFabricatie = anFabricatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie){
        this.anFabricatie = anFabricatie;
    }
}
