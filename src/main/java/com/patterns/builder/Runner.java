package com.patterns.builder;

class Runner {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder()
                .setName("Audi")
                .build();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
    }
}
