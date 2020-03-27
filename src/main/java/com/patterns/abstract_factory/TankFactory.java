package com.patterns.abstract_factory;

public class TankFactory implements Factory{
    public Tank createTank(String typeOfTank){
        switch (typeOfTank){
            case "T51": return new T51();
            case "T52": return new T52();
            default: return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}
