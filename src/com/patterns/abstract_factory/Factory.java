package com.patterns.abstract_factory;

interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}
