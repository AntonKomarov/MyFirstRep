package com.anton.calculator;

public class Scalar extends Var{

    private double scalar;

    public double getScalar() {
        return scalar;
    }

    Scalar(double value) {
        this.scalar = value;
    }

    Scalar(Scalar scalar) {
        this.scalar = scalar.scalar;
    }

    Scalar(String strScalar) {
        this.scalar = Double.parseDouble(strScalar);
    }

    @Override
    public String toString(){
        return "This Scalar constructor";
    }


}
