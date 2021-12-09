package com.javatechniques.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackImpl {

    public static void printNextGreaterElement(int[] array) {
        if (array.length == 0) {
            System.out.println("Array " + array +
                    " empty.");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);

        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                while (popped < next) {
                    System.out.println(popped + " --> " + next);
                    if (stack.isEmpty()) {
                        break;
                    }
                    popped = stack.pop();
                }

                if (popped > next) {
                    stack.push(popped);
                }
            }
            stack.push(next);

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() +  " --> " + -1);
        }
    }


    public static void main(String[] args) {

        Stack<String> stackExample = new Stack<>();

        stackExample.push("Potato");
        stackExample.push("Granola");
        stackExample.push("Sabão");
        stackExample.push("Sagu");
        stackExample.push("Pirão");
        stackExample.pop();

        System.out.println(stackExample);
        System.out.println(stackExample.peek());


        Deque<String> dequeStack = new ArrayDeque<>();

        dequeStack.push("Potato");
        dequeStack.push("Granola");
        dequeStack.push("Sabão");
        dequeStack.push("Sagu");
        dequeStack.push("Pirão");
        dequeStack.pop();

        System.out.println(dequeStack);
        System.out.println(dequeStack.peek());

        printNextGreaterElement(new int[]{14, 7, 2, 20});


    }
}
