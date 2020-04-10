package com.epam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {

    public static Map<String,String> ret(Map<String,String> map){
        map.remove("c");
        String valueA = map.get("a");
        if(map.containsKey("b")){
            map.replace("b", map.get("b"), valueA);
        } else if (!(map.containsKey("b"))){
            map.put("b", valueA);
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
//            put("b", "candy");
            put("c", "dirt");
        }};

        printMap(ret(map));
    }
}



