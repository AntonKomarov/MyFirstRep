package com.anton.Calc;

public class Scalar implements Operation{
    @Override
    public void add() {
        System.out.println("add 3 + 3 = 6");
    }
    @Override
    public void minus() {
        System.out.println("minus 3 - 3 = 0");
    }
}
