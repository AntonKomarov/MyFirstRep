package com.anton.prog_hub;

public class Task34 {
    int i;
     static int j;

    {
        j=0;
    }

    Task34(int i, int j){
        System.out.println(this.i = i);
    }


    public static void main(String[] args) {
        Task34 b = new Task34(6,7);

        System.out.println(b.i);
        System.out.println(Task34.j);
    }
}
