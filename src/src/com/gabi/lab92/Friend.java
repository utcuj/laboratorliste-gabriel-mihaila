package com.gabi.lab92;

import javax.swing.*;

public class Friend {
    private String nume;
    private String locatiaCurenta;

    public Friend(String nume, String locatiaCurenta) {
        this.nume = nume;
        this.locatiaCurenta = locatiaCurenta;
    }

    public boolean equals(Object o){
        Friend friend = (Friend) o;
        if(this.nume.equals(friend.getNume()) && this.locatiaCurenta.equals(friend.getLocatiaCurenta())){
            return true;
        }
        else
            return false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatiaCurenta() {
        return locatiaCurenta;
    }

    public void setLocatiaCurenta(String locatiaCurenta) {
        this.locatiaCurenta = locatiaCurenta;
    }
}
