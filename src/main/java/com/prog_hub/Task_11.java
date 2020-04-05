package com.prog_hub;


class MyLink{
     MyLink(){
        str = "New";
    }
     String str;
}

public class Task_11 {
    public static void main(String[] args) {
MyLink b1 = new MyLink();
        System.out.println(b1.str);
MyLink b2 = b1;
        System.out.println(b2.str);
b2.str = "My String";
        System.out.println(b1.str);
        b2.str = "qweq";
        System.out.println(b1.str);

        String a1 = "Test";
        String a2 = a1;
        System.out.println(a2);
        a1 = "Not a Test";
        System.out.println(a2);
    }
}
