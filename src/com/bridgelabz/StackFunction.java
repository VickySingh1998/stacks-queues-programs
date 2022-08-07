package com.bridgelabz;

import java.util.LinkedList;

public class StackFunction {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int data) {
        stack.addFirst(data);
    }

    public void myPrint() {
        System.out.println("Stack list Is :-");
        for (Integer i : stack) {
            System.out.print(" " + i);
        }
    }
}
