package com.anton.prog_hub;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        Integer y = new Integer(x);
        int [] z = {x};

        func(x, y, z);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z[0]);
    }

    static void func(int x, Integer y, int[] z) {
        x++;
        y++;
    }
}
