package com.patterns.abstract_factory;

public class TankFactory {
    public Tank creator(String typeOfTank){
        switch (typeOfTank){
            case "T51": return new T51();
            case "T52": return new T52();
            default: return null;
        }
    }
}
