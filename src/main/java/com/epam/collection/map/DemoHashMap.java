package com.epam.collection.map;

import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(3){
            {
                this.put("Сырок", 3);
                this.put("Пряник", 5);
                this.put("Молоко", 1);
                this.put("Хлеб", 1);
            }
        };
        System.out.println(hashMap);
        hashMap.put("Пряник", 4);

        System.out.println(hashMap + " после замены элемента");
        Integer a = hashMap.get("Хлеб");
        System.out.println(a + " - найдет по ключу 'Хлеб' ");

        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        System.out.println(set);
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> mapEntry = iterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
        Set<Integer> set1 = new HashSet<>(hashMap.values());
        System.out.println(set1);
    }
}
