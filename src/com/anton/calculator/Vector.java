package com.anton.calculator;

public class Vector extends Var{

    private double[] vector;

    public Vector(double[] vector) {
        this.vector = new double[vector.length];
        System.arraycopy(vector, 0, this.vector, 0, this.vector.length);
    }

    public Vector(String strVector) {
        String[] words = strVector.split(",");
        this.vector = new double[words.length];
        for (int i = 0; i < this.vector.length; i++) {
            this.vector[i] = Double.parseDouble(words[i]);
        }
    }

    public Vector(Vector vector1) {
        this.vector = vector1.vector;
    }

    @Override
    public String toString(){
        return "This Vector constructor";
    }
}
