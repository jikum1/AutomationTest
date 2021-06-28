package com.learn.algorithms;

import java.util.Stack;

public class StackDataStructureJava {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // Returns the position of the element from the top of the stack
        System.out.println("Stack Search " + stack.search("jitendra"));
        System.out.println("Stack Search " + stack.search("two"));
        System.out.println("Stack Search " + stack.search("one"));
        System.out.println("Stack" + stack);

        System.out.println(stack.pop());


        System.out.println("Top of the stack " + stack.peek());
        System.out.println("Empty or Not" + stack.empty());

        System.out.println(stack.pop());

        //Exception is thrown if pop is done if the stack is empty.
        System.out.println(stack.pop());


    }
}
