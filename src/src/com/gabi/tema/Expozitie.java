package com.gabi.tema;

import com.gabi.lab10_5.Dog;

import java.util.HashMap;
import java.util.Map;

public class Expozitie {
    private HashMap<Integer,Car> data= new HashMap<>();

    public void addCars(int key, Car car){
        data.put(key,car);
    }

    public void listCars(){
        for(Map.Entry<Integer, Car> entry: data.entrySet()){
            System.out.println("Car number: " + entry.getKey());
            System.out.println("Car: " + entry.getValue().getNume() + " year: " + entry.getValue().getAnFabricatie());
        }
    }

    public void listNameCars(){
        for(Car c: data.values()){
            System.out.println("Car name: " + c.getNume());
        }
    }

    public void listNumber(){
        for(Integer key: data.keySet()){
            System.out.println("Car number: " + key);
        }
    }

    public void removeCar(Integer key){
        data.remove(key);}
}
