package com.practice.sort;

public class Task1 {
    public static void main(String[] args) {
        float amount = 1.0000005F;
        float avalue = 0.0000004F;
        float result = amount - avalue;
        System.out.println(result);

        double sqrt = Math.sqrt(-4);
        System.out.println(sqrt + 1);
        if (Double.isNaN(sqrt)) {
            System.out.println("So sad");
        }
        System.out.println(Double.NaN == sqrt);
    }
}
