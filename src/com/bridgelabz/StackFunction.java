package com.bridgelabz;

import java.util.LinkedList;

public class StackFunction {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int data) {
        stack.addFirst(data);
    }
    public void peek(){
        System.out.println();
        System.out.println("Stack List In The Peek Is :-"+stack.peek());
    }
    public void pop(){
        if (stack.size()==0){
            System.out.println("Stack List Is Empty");
        }else{
            stack.pop();
        }
    }

    public void myPrint() {
        System.out.println();
        System.out.println("Stack list Is :-");
        for (Integer i : stack) {
            System.out.print(" " + i);
        }
    }
}
