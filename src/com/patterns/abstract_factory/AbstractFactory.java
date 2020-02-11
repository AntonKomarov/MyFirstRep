package com.patterns.abstract_factory;

public class AbstractFactory {
    Factory createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "Car": return new CarFactory();
            case "Tank": return new TankFactory();
            default: return null;
        }
    }
}
