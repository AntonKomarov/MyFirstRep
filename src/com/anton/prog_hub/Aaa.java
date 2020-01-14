package com.anton.prog_hub;

public class Aaa {
    private double x = 2;
    private static void multX(Aaa a, double n){
        a.setX(a.getX() * n);
    }

    private void setX(double xn) {
        x = xn;
    }
    private double getX() {
        return x;
    }
    private static double trippleValue(double x){
        x *= 3;
        return x;
    }
    private static Aaa resetX(Aaa a){
        a = new Aaa();
        return a;
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println(trippleValue(x)); // x = 9.0
        System.out.println(x); // x = 3
        Aaa anA = new Aaa();
        multX(anA, x); // x = 6.0
        resetX(anA);
        x = 0;
        System.out.println(anA.getX());
    }
}
