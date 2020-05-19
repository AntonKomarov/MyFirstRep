package com.practice.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Process {
    public static String process(List<? extends String> peoples){
        Iterator<? extends String> iterator = peoples.iterator();
        int count = 0;
        while (iterator.hasNext()){
            count++;
            iterator.next();
            if (count % 2 == 0) {iterator.remove();}
        }
        print(peoples);
        if(peoples.size() != 1) {return process(peoples);}
        return peoples.toString();
    }

    public static void print(List<? extends String> list){
        System.out.println(list);
    }

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Tanya");
            list.add("Lera");
            list.add("Katya");
            list.add("Larisa");
            list.add("Olga");
            list.add("Sasha");
            process(list);
        }
}

