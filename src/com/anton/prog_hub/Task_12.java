package com.anton.prog_hub;

import java.util.Hashtable;

public class Task_12 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("2", "2");
        ht.put("6", "1");
        ht.put("3", "3");
        if(ht.contains("1")){
            System.out.println(ht.get("6"));
        }
        if(ht.contains("2")){
            System.out.println("2");
        }
        if(ht.contains("3")){
            System.out.println("3");
        }
        if(ht.contains("4")){
            System.out.println("4");
        }
    }
}
