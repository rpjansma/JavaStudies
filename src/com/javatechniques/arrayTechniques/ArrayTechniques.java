package com.javatechniques.arrayTechniques;

import java.util.ArrayList;

public class ArrayTechniques {

    public static int[] findTheEvenNumber(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : array1) {
            if(num % 2 == 0) {
                result.add(num);
            }
        }

        for(int num : array2) {
            if(num % 2 == 0) {
                result.add(num);
            }
        }

        var finalResult = result.stream().mapToInt(Integer::intValue).toArray();

        for(int value : finalResult) {
            System.out.println(value);
        }

        return finalResult;
    }

    public static void main(String[] args){

        int[] array1 = {1, 3, 6, 7, -321, -5, 2, 78, 321, 673, -320, -11110, 132534};

        int[] array2 = {13, 521, -0, 345, -321, -5, 0, 78, 123, 673, -57, -11110, 321};

        System.out.println(findTheEvenNumber(array1, array2));
    }
}