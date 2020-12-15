package com.gabi.lab10_5;

public class TestMain {
    public static void main(String[] args) {
        PetHotel hotel = new PetHotel();
        Dog dog1 = new Dog("Rino",3);
        Dog dog2 = new Dog("Azorel",2);
        Dog dog3 = new Dog("Bruno",5);
        Dog dog4 = new Dog("Rex",4);
        Dog dog5 = new Dog("Ozzy",8);

        hotel.addDog(dog1,1);
        hotel.addDog(dog2,2);
        hotel.addDog(dog3,3);
        hotel.addDog(dog4,4);
        hotel.afisareCatei();
        System.out.println("\nDupa update: ");
        hotel.addDog(dog5,4);
        hotel.afisareCatei();

        System.out.println();
        hotel.afisareNumeCatei();
        System.out.println();
        hotel.afisareCamere();

        hotel.removeDog(2);
        System.out.println("\nDupa update: ");
        hotel.afisareCatei();
    }
}
