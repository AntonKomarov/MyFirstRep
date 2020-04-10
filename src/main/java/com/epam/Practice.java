package com.epam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {

    public static Map<String,String> ret(Map<String,String> map) {
        if(map.containsKey("ice cream")){
            map.put("bread", "butter");
            map.replace("ice cream", map.get("ice cream"), "cherry");
        } else
        if (map.size() == 0){
            map.put("bread", "butter");
        } else
            if(!(map.containsKey("ice cream"))){
                map.put("bread", "butter");
            }
        return map;
    }

    public static void printMap(Map<String,String> map){
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(){{
            put("ice cream", "candy");
            put("b", "dirt");
        }};

        printMap(ret(map));
    }
}



