package com.practice.sort;

public class Search {
    public static void main(String[] args) {
       int[] array  = new int[]{40,30,50,10,60,90,80,70};
    }
    public static int binarySearch(int[] array, int key, int left, int right) {
        int index = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if      (array[middle] <  key)  { left  = middle + 1; }
            else if (array[middle] >  key)  { right = middle - 1; }
            else if (array[middle] == key)  { index = middle; break; }
        }
        return index;
    }
}
