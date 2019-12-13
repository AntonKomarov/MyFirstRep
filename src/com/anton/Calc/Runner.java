package com.anton.Calc;

public class Runner {
    public static void main(String[] args) {
        CreateOperation createOperation = new CreateScalar();
        Operation operation = createOperation.createOperation();
        operation.add();
        operation.minus();
    }
}
