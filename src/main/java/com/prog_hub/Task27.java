package com.prog_hub;

public class Task27 {

    static class X{
        static String x = Y.y;
    }

    static class Y{
        static String y = X.x;
    }

    public static void main(String[] args) throws Throwable {
        System.out.println(Y.y);
        System.out.println(Y.y = "0");
        System.out.println(X.x);
    }
}
