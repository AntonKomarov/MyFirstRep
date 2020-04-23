package com.it_academy.sort;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        fromMaxToMin(list,scanner);
        System.out.println(list);
    }

    public static List<Integer> fromMaxToMin(List<Integer> list, Scanner scanner){
        int posZero=0;
        for(;;) {
            String word = scanner.next();
            if (word.equals("end")) {
                break;
            }
            Integer i = Integer.valueOf(word);
            if(i < 0)  list.add(list.size(), i);
            if(i > 0) list.add(posZero++, i);
            if(i == 0) list.add(list.size()/2, i);
        }
        return list;
    }
}
