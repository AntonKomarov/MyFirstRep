package com.anton.prog_hub;

public class Task28 {
    int i = 0;
    public int increment(){
        return ++i;
    }
}

 class Be extends Task28 {
    int i = 1;
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        Task28 b = new Task28();
        System.out.println(b.increment());
    }
}
