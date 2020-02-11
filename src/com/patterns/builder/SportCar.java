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

    private SportCar(Builder builder){
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    static class Builder{
        private String name;
        private String color;
        private int maxSpeed;

        Builder(String name){
            this.name = name;
        }

        protected Builder setColor(String color){
            this.color = color;
            return this;
        }

        protected Builder setMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        protected SportCar build(){
            return new SportCar(this);
        }
    }
}
