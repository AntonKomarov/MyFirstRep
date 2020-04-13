package com.epam;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    // количество повторяющися элементов
    public static Map<String,Integer> ret(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : strings) {
            if(!map.containsKey(word)){
                map.put(word,1);
            } else {
                int count = map.get(word);
                map.put(word, count+1);
            }
        }
        return map;
    }

    public static Map<String,String> coll(Map<String,String> map) {
        boolean potato = map.containsKey("potato");
        boolean fries = map.containsKey("fries");

        boolean salad = map.containsKey("salad");
        boolean spinach = map.containsKey("spinach");


        if(potato && !fries)
            map.put("fries", map.get("potato"));
        if(potato && spinach)
            map.replace("fries",map.get("fries"), map.get("potato"));

        if(salad && !spinach)
            map.put("spinach", map.get("salad"));
        if(salad && spinach)
            map.replace("spinach",map.get("spinach"), map.get("salad"));
        return map;
    }


    public static void main(String[] args) {


    }
}



