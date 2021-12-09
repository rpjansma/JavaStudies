package com.javatechniques.hashes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheLostMemberAlgorithmWithHashSet {

    public static List<Integer> findMissingMembers(int[] array1, int[] array2){
        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : array2) {
            hashSet.add(x);
        }
        for (int x : array1) {
            if (!hashSet.contains(x)) {

                missingElements.add(x);
            }
        }
        return missingElements;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5, 67, 8};
        int[] array2 = {2, 3, 3, 67, 8};

        System.out.println(findMissingMembers(array1, array2));

    }
}
