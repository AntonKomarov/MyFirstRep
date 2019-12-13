package com.anton.Calc;

public class CreateScalar implements CreateOperation{
    @Override
    public Operation createOperation() {
        return new Scalar();
    }
}
