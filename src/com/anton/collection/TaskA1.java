package com.anton.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskA1 {
    private List<Integer> grades = new ArrayList<>();

    public void clearBad(List<Integer> grades){
//        while (iterator.hasNext()){
//            int grade = iterator.next();
//            if (grade < 4)
//                iterator.remove();
//        }

//        grades.removeIf(i->(i<4));
        
        grades.removeIf(grade -> grade < 4);
    }

    public static void main(String[] args) {

        TaskA1 task = new TaskA1();
        for (int i = 0; i < 20; i++) {
            task.grades.add(1 + (int) (Math.random() * 10));
        }
            System.out.print(task.grades);
    }
}
