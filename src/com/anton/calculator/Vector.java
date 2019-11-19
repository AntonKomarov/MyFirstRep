package com.anton.calculator;

import java.util.Arrays;

public class Vector extends Var{

    private double[] vector;

    Vector(double[] vector) {
        this.vector = new double[vector.length];
        System.arraycopy(vector, 0, this.vector, 0, this.vector.length);
    }

    Vector(String strVector) {
        String[] words = strVector.split(",");
        this.vector = new double[words.length];
        for (int i = 0; i < this.vector.length; i++) {
            words[i] = String.valueOf(this.vector[i]);
        }
    }

    Vector(Vector vector1) {
        this.vector = vector1.vector;
    }

    @Override
    public String toString(){


        return "This Vector constructor";
    }
}
