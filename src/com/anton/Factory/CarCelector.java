package com.anton.Factory;

class CarCelector {

    Car getCar(RoadType roadType){
        Car car = null;

        switch (roadType){
            case CITY:
                car = new Mercedes();
                break;
            case ROAD:
                car = new Crossover();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
        }
        return car;
    }

}
