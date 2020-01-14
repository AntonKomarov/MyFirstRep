package com.anton.prog_hub;

public class Aaa {
    private double x = 2;
    public static void multX(Aaa a, double n){
        a.setX(a.getX() * n);
    }

    private void setX(double xn) {
        x = xn;
    }
    private double getX() {
        return x;
    }
    public static double trippleValue(double x){
        x *= 3;
        return x;
    }
    public static Aaa resetX(Aaa a){
        a = new Aaa();
        return a;
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println(trippleValue(x)); // x = 3
        System.out.println(x);
        Aaa anA = new Aaa();
        multX(anA, x); // x = 6
        resetX(anA);
        x = 0;
        System.out.println(anA.getX());
    }
}