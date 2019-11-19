package com.anton.calculator;

public class Runner {
    public static void main(String[] args) {

        Scalar scalar1 = new Scalar(3.1415);
        Var scalar2 = new Scalar("3.1415");
        Var scalar3 = new Scalar(scalar1);

        System.out.println(scalar1);
        System.out.println(scalar2);
        System.out.println(scalar3);


        Vector vector1 = new Vector(new double[]{1,2,4});
        Var vector2 = new Vector("1,2,6");
        Var vector3 = new Vector(vector1);

        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println(vector3);


        Matrix matrix1 = new Matrix(new double[][]{{1,2}, {3,4}});
        Var matrix2 = new Matrix("1,2,3,4");
        Var matrix3 = new Matrix(matrix1);
    }
}
