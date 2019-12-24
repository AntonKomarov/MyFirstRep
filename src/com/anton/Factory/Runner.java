package com.anton.Factory;

public class Runner {
    public static void main(String[] args) {
        CarCelector carCelector = new CarCelector();

        Car car = carCelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carCelector.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carCelector.getCar(RoadType.ROAD);
        car.drive();
        car.stop();

        car = carCelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();
    }
}
