package com.anton.Calc;

public class CreateVector implements CreateOperation {
    @Override
    public Operation createOperation() {
        return new Vector();
    }
}
