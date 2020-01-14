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
    public static void trippleValue(double x){
        x *= 3;
    }
    public static Aaa resetX(Aaa a){
        a = new Aaa();
        return a;
    }

}
