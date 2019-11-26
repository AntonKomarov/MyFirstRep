package com.anton.jd01_05_homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input size of array: ");
        int sizeArr = scanner.nextInt();
        int[] array = new int[sizeArr];
        String[] line = new String[array.length];

        System.out.print("Input \"Int\" elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            line[i] = Integer.toString(array[i]);
        }

        for (String element: line) {
            System.out.printf("Line:%s\n", element);
        }

        int min = line[0].length();
        int max = line[0].length();

        for (String element : line) {
            if (element.length() < min) {
                min = element.length();
            } else if (element.length() > max) {
                max = element.length();
            }
        }
        System.out.printf("Минимальная длинна элемента массива = %d\n", min);
        System.out.printf("Максимальная длинна элемента массива = %d\n", max);

        for (String element : line) {
            if (element.length() == min) {
                System.out.printf("Число:%s Длинна = %d\n", element, element.length());
            } else if (element.length() == max) {
                System.out.printf("Число:%s Длинна = %d\n", element, element.length());
            }
        }


    }
}
