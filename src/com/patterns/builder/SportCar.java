package com.patterns.builder;

class SportCar extends Object{
    private String name;
    private String color;
    private int maxSpeed;

    protected String getName(){
        return name;
    }

    protected String getColor(){
        return color;
    }

    protected int getMaxSpeed(){
        return maxSpeed;
    }

    private SportCar(){
    }

    static class Builder{
        SportCar sportCar;

        public Builder(){
            sportCar = new SportCar();
        }

        protected Builder setName(String name){
            sportCar.name = name;
            return this;
        }

        protected Builder setColor(String color){
            sportCar.color = color;
            return this;
        }

        protected Builder setMaxSpeed(int maxSpeed){
            sportCar.maxSpeed = maxSpeed;
            return this;
        }

        protected SportCar build(){
            return sportCar;
        }
    }
}
