package com.javatechniques.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackImpl {



    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Potato");
        stack.push("Granola");
        stack.push("Sabão");
        stack.push("Sagu");
        stack.push("Pirão");
        stack.pop();

        System.out.println(stack);
        System.out.println(stack.peek());


        Deque<String> dequeStack = new ArrayDeque<>();

        dequeStack.push("Potato");
        dequeStack.push("Granola");
        dequeStack.push("Sabão");
        dequeStack.push("Sagu");
        dequeStack.push("Pirão");
        dequeStack.pop();

        System.out.println(dequeStack);
        System.out.println(dequeStack.peek());


    }
}
