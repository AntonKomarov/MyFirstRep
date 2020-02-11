package com.patterns.abstract_factory;

class CarFactory {
    public Car creator(String typeOfCar){
        switch (typeOfCar){
            case "Audi": return new Audi();
            case "BMW": return new BMW();
            default: return null;
        }
    }
}
