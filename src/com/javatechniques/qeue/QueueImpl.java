package com.javatechniques.qeue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

    public static void printBinaryNumber(int n) {
        if (n <= 0) {
            System.out.println("The input " + n + " is invalid.");
            return;
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        for(int i = 0; i <= n ; i++) {
            int current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Queue filinha = new LinkedList();

        filinha.add(1);
        filinha.add(9);
        filinha.add(5);
        filinha.add(3);

        while(!filinha.isEmpty()){
            System.out.println(filinha.remove());
        }
        System.out.println("Fim do remove.");
        filinha.peek();

        printBinaryNumber(3);
        printBinaryNumber(1);
        printBinaryNumber(0);
        printBinaryNumber(10);

    }
}
