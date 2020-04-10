package com.epam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {

    public static Map<String,String> ret(Map<String,String> map){

        if(map.containsKey("a") && map.containsKey("b")){
            String valueA = map.get("a");
            String valueB = map.get("b");
            map.put("ab", (map.get("a") + map.get("b")));
            return map;
        } else
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
            put("a", "candy");
            put("b", "dirt");
        }};

        printMap(ret(map));
    }
}



