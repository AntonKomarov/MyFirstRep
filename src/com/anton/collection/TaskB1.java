package com.anton.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.next();
            if (word.equals("end")) {
                break;
            }
            Integer i = Integer.valueOf(word);
            list.add(i);
        }


    }
}
