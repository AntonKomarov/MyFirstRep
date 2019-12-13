package com.anton.Calc;

public class Vector implements Operation{
    @Override
    public void add() {
        System.out.println("add 3 + 3 + 3 = 9");
    }

    @Override
    public void minus() {
        System.out.println("add 3 - 3 - 3 = -3");
    }
}
