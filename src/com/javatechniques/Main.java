package com.javatechniques;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        ArrayList numeros = new ArrayList();

        numeros.add(1);

        String[] letras = {"a", "a", "b", "b", "c", "d"};

        Arrays.stream(letras).filter(letra -> letra != "a").forEach(letra -> System.out.println(letra));
    }
}
