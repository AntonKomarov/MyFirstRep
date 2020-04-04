package com.anton.prog_hub.middle;

public class Overload {
    public static void main(String[] args) {
        Test t = new Test();
        t.clone();
        System.out.println(t.i);
    }
}

class Test{
    int i;
    public Object clone(){
        i = 15;
        return i;
    }
}
