package com.anton.jd02_01;

import java.util.HashMap;
import java.util.Map;

public class Goods {

    private static Map<Integer, Good> goods = new HashMap<>();

    static {
        goods.put(1, new Good("Bread",2.0));
        goods.put(2, new Good("Milk",1.5));
        goods.put(3, new Good("Water", 1.2));
        goods.put(4, new Good("Rice", 1.3));
        goods.put(5, new Good("Fish", 4.6));
        goods.put(6, new Good("Chips", 2.7));
        goods.put(7, new Good("Pasta", 1.6));
        goods.put(8, new Good("Bacon", 4.9));
    }

    static Good getRandomGood() {
        int id = 1 + (int) (Math.random()*8);
        return goods.get(id);
    }
}
