package com.anton.collection;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> myList = new TaskA<>();
        List<String> arList = new ArrayList<>();


        myList.add("First"); arList.add("First");
        myList.add("Second"); arList.add("Second");
        myList.add("Third"); arList.add("Third");
        System.out.println("myList:" + myList + "\narList:" + arList);

        myList.add(2, "Tree"); arList.add(2, "Tree");
        myList.add(0, "Start"); arList.add(0, "Start");
        System.out.println("myList:" + myList + "\narList:" + arList);

        myList.remove("Start"); arList.remove("Start");
        myList.remove(3); arList.remove(3);
        arList.set(2,"Set");
        System.out.println("myList:" + myList + "\narList:" + arList);



        System.out.println("myList:" + myList.get(0) + "\narList:" + arList.get(0));
    }
}
