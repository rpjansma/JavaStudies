package com.javatechniques.hashes;

import com.javatechniques.model.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapImpl {

    public static void main(String[] args) {
        Employee employee0 = new Employee(123, "Juca", "Vendas");
        Employee employee1 = new Employee(321, "Tatu", "Contabilidade");
        Employee employee2 = new Employee(231, "Bola", "RH");


        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(employee0.getId(), employee0);
        employeeHashMap.put(employee1.getId(), employee1);
        employeeHashMap.put(employee2.getId(), employee2);

        System.out.println(employeeHashMap.get(123).getName());
        //System.out.println(employeeHashMap.get(142).getName()); //It retrieves a null pointer exception

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("Batata");
        productCodes.add("Potato");
        productCodes.add("Hakuna");


        System.out.println(productCodes.contains("Matata"));
        System.out.println(productCodes.remove("Hakuna"));
        System.out.println(productCodes.contains("Hakuna"));
        System.out.println(productCodes.remove("Hakuna"));

    }

}
