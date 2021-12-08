package com.javatechniques.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(51);
        treeSet.add(78);
        treeSet.add(1); //can't duplicate
        System.out.println(treeSet);

        Set<String> wordSet = new TreeSet<>();

        wordSet.add("Batata");
        wordSet.add("Arroz");
        wordSet.add("Tomate");
        wordSet.add("Limão");
        wordSet.add("Noz");
        wordSet.add("Moz");

        System.out.println(wordSet);

    }
}
