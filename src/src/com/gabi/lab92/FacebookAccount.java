package com.gabi.lab92;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FacebookAccount {
    private String nume;
    private int varsta;
    private String locatieCurenta;
    private List<Friend> prieteni = new ArrayList<Friend>();

    public FacebookAccount(String nume, int varsta, String locatieCurenta, List<Friend> prieteni) {
        this.nume = nume;
        this.varsta = varsta;
        this.locatieCurenta = locatieCurenta;
        this.prieteni = prieteni;
    }

    public void addFriend(Friend friend){
        this.prieteni.add(friend);
    }

    public void removeFriend(Friend friend){
        this.prieteni.remove(friend);
    }

    public List<Friend> searchFriend(String locatie){
        List<Friend> prieteniGasiti = new ArrayList<>();

        for(Friend friend: prieteni){
            if(friend.getLocatiaCurenta().equals(locatie)){
                prieteniGasiti.add(friend);
            }
        }
        return prieteniGasiti;
    }

    public void listFriend(){
        for(Friend friend: prieteni){
            System.out.println(friend.getNume() + " " + friend.getLocatiaCurenta());
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getLocatieCurenta() {
        return locatieCurenta;
    }

    public void setLocatieCurenta(String locatieCurenta) {
        this.locatieCurenta = locatieCurenta;
    }

    public List<Friend> getPrieteni() {
        return prieteni;
    }

    public void setPrieteni(List<Friend> prieteni) {
        this.prieteni = prieteni;
    }
}
