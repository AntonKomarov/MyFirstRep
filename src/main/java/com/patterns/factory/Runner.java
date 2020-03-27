package com.patterns.factory;

class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.creator("Toyota");
        Car bmw = factory.creator("BMW");
        toyota.drive();
        bmw.drive();
    }
}
