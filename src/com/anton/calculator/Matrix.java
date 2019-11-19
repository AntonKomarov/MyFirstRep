package com.anton.calculator;

public class Matrix extends Var{

    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(String strMatrix) {
        String[] strings = strMatrix.split(",");
        this.matrix = new double[strings.length][strings.length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                this.matrix[i][j] = Double.parseDouble(strings[i]);
            }
        }
    }

    public Matrix(Matrix matrix1) {
    }

    @Override
    public String toString(){
        return "This Matrix constructor";
    }
}
