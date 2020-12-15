package com.gabi.lab92;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Friend[] friend = new Friend[] {new Friend("Rares Cardoso","Cluj-Napoca"),
                new Friend("Dumitru Razvan","Sibu"),
                new Friend("Eveline Buta","Bucuresti"),
                new Friend("Rus Simona","Dej"),
                new Friend("Marin Bianca","Bucuresti")};

        FacebookAccount profile = new FacebookAccount("Gabriel Mihaila",20,"Sibiu", new ArrayList<>());
        profile.addFriend(friend[0]);
        profile.addFriend(friend[1]);
        profile.addFriend(friend[2]);
        profile.addFriend(friend[3]);

        profile.listFriend();
        profile.removeFriend(friend[1]);
        System.out.println();
        profile.listFriend();

        List<Friend> prieteniGasiti = profile.searchFriend("Bucuresti");
        System.out.println();
        System.out.println("Lista de prieteni gasiti:");
        for(Friend prieten : prieteniGasiti){
            System.out.println(prieten.getNume() + " " +prieten.getLocatiaCurenta());
        }

    }

}
