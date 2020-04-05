package com.epam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean b;
        for (int i = 0; i < 6; i++) {
            list.add((int) (Math.random() * 10) + "Y");
        }
        System.out.println(list + " список");
        TreeSet<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet + " множество");
        System.out.println(treeSet.comparator());
        System.out.println(treeSet.first() + " " + treeSet.last());

        HashSet<String> hashSet = new HashSet<>(treeSet);
        for (String str: hashSet) {
            System.out.println(str + " " + hashSet.hashCode());
        }
       }
}
