package com.anton.prog_hub;

public class Task29 {
    public static void main(String[] args) {
        int i = 1;
        i <<= 1;
        float f = 1;
//      f = f << 1; // поразрядные операции разрешается использовать для целых чисел
        System.out.println(i + ", " + f);
    }
}
