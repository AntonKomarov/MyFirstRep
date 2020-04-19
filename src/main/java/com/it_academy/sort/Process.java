package com.it_academy.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Process {
    public static String process(List<String> peoples){
        Iterator<String> iterator = peoples.iterator();
        int count = 0;
        while (iterator.hasNext()){
            count++;
            iterator.next();
            if (count % 2 == 0) {
                iterator.remove();
            }
        }
        if(peoples.size() != 1)
            return process(peoples);
        System.out.println(peoples);
        return peoples.toString();
    }

        public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anton");
        list.add("Tanya");
        list.add("Lera");
        list.add("Olga");
        list.add("Katya");
        list.add("Larisa");
        list.add("Sasha");
        process(list);

            LinkedList<String> list1 = new LinkedList<>();
            list1.add("Anton");
            list1.add("Tanya");
            list1.add("Lera");
            list1.add("Olga");
            list1.add("Katya");
            list1.add("Larisa");
            list1.add("Sasha");
            process(list1);
        }
    }

