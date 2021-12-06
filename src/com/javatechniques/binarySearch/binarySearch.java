package com.javatechniques.binarySearch;

import java.util.List;

public class binarySearch {

    public static int binarySearch(int[] array, int searchNumber) {
        int min = 0;
        int max = array.length - 1;
        System.out.println("The number we are looking for is: " + searchNumber);
        while (min <= max) {
            int mid = (min + max) / 2;
            System.out.println("Now the reference is: " + mid);
            System.out.println("The value is: " + array[mid]);
            if(searchNumber == array[mid]) {
                return array[mid];
            } else if (searchNumber < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(list, 3));
    }


}
