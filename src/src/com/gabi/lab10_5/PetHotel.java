package com.gabi.lab10_5;

import java.util.HashMap;
import java.util.Map;

public class PetHotel {

    private HashMap<Integer,Dog> registru = new HashMap<Integer, Dog>();

    public void addDog(Dog dog,int key) {
        registru.put(key,dog);
    }

    public void afisareCatei(){
        for(Map.Entry<Integer,Dog> entry: registru.entrySet()){
            System.out.println("Room number: " + entry.getKey());
            System.out.println("Dog: " + entry.getValue().getName() + " age: " + entry.getValue().getAge());
        }
    }

    public void afisareNumeCatei(){
        for(Dog d: registru.values()){
            System.out.println("Dog: " + d.getName());
        }
    }

    public void afisareCamere(){
        for(Integer key: registru.keySet()){
            System.out.println("Camera: " + key);
        }
    }

    public void removeDog(Integer key){
        registru.remove(key);
    }
}
