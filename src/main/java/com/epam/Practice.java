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
       boolean a = map.containsKey("a");
       boolean b = map.containsKey("b");
        if(a && b){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
      return map;
    }


    public static void main(String[] args) {


    }
}



