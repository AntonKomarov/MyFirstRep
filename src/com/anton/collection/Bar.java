package com.anton.collection;

class Super{
    Super(){
        System.out.println("Super contructor");
    }
}

public class Bar extends Super{
    Bar(){
        this(1);
        System.out.println("Main() contructor");
    }

    Bar(int i){
        System.out.println("Main(int) contructor");
    }

    public static void main(String[] args) {
        new Bar();
    }

}






