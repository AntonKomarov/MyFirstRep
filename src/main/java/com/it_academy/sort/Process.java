package com.it_academy.sort;

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


            List<String> list1 = new LinkedList<>();
            list1.add("Anton");
            list1.add("Tanya");
            list1.add("Lera");
            list1.add("Olga");
            list1.add("Katya");
            list1.add("Larisa");
            list1.add("Sasha");
            list1.add("Anton");
            list1.add("Tanya");
            list1.add("Lera");
            list1.add("Olga");
            list1.add("Katya");
            list1.add("Larisa");
            list1.add("Sasha");
            System.out.println(list1);
            process(list1);
        }
    }

