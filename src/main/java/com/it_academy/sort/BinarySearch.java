package com.it_academy.sort;

public class BinarySearch {
    public static void main(String[] args) {
       int[] array  = new int[]{10,20,30,40,50,60,70};
       int left = 0;
       int right = array.length-1;

        System.out.println(binarySearch(array,20, left, right));
    }

    public static int binarySearch(int[] array, int key, int left, int right) {
        int index = -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] < key){
                left = middle + 1;
            } else if (array[middle] > key) {
                right = middle - 1;
            } else if (array[middle] == key) {
                index = middle;
                break;
            }
        }
        return index;
    }
}
