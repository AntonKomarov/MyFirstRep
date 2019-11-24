package com.anton.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listArr = new ArrayList<>();

        int posZero = 0;

        while (true) {
            String word = scanner.next();
            if (word.equals("end"))
                break;
            Integer i = Integer.valueOf(word);
            if (i < 0)
                listArr.add(i);
            else  if (i == 0)
                listArr.add(posZero, i);
            else
                listArr.add(posZero++, i);
        }
        System.out.println(listArr);
    }
}
