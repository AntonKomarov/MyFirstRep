package com.anton.prog_hub.middle;

public class Person {
    private String name = "Tanya";

    public Person(String name){
        this.name = name;
    }

    public boolean equals(Person p){
        return p.name.equals(this.name);
    }

    public static void main(String[] args) {
        Person p = new Person("Anton");
        System.out.println(p.equals(p));
    }
}
