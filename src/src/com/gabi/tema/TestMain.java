package com.gabi.tema;

public class TestMain {
    public static void main(String[] args) {
        Expozitie expozitie = new Expozitie();
        Car car1 = new Car("BMW M4",1999);
        Car car2 = new Car("Audi A8",2004);
        Car car3 = new Car("Mercedes S Class",2014);
        Car car4 = new Car("Volkswagen Golf 7",2015);
        Car car5 = new Car("Skoda Octavia",2002);

        expozitie.addCars(1, car1);
        expozitie.addCars(2, car2);
        expozitie.addCars(3, car3);
        expozitie.addCars(4, car4);


        expozitie.listCars();
        System.out.println("\nDupa update: ");
        expozitie.addCars(4, car5);
        expozitie.listCars();

        System.out.println();
        expozitie.listNameCars();
        System.out.println();
        expozitie.listNumber();

        expozitie.removeCar(2);
        System.out.println("\nDupa update: ");
        expozitie.listCars();
    }
}
