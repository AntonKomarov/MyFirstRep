package com.patterns.factory;

public class Factory {
    public Car creator(String typeOfCar){
        switch(typeOfCar){
            case "Toyota": return new Toyota();
            case "BMW": return new BMW();
            default: return null;
        }
    }
}
