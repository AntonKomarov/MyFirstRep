package com.patterns.abstract_factory;

class Runner {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");

        Car audi = carFactory.createCar("Audi");
        Car bmw = carFactory.createCar("BMW");
        audi.drive();
        bmw.drive();

        Tank t51 = tankFactory.createTank("T51");
        Tank t52 = tankFactory.createTank("T52");
        t51.fire();
        t52.fire();
    }
}
