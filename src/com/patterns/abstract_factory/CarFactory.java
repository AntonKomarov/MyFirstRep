package com.patterns.abstract_factory;

class CarFactory implements Factory{
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Audi": return new Audi();
            case "BMW": return new BMW();
            default: return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}
