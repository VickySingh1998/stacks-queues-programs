package com.bridgelabz;

import java.util.LinkedList;
public class QueueFunction {
    LinkedList<Integer> queue = new LinkedList<>();
    public void enQueue(int data)
    {
        queue.add(data);
    }
    public void deQueue() {
        if (queue.size() == 0) {
            System.out.println("Queue List Is Empty");
        } else {
            queue.pop();
        }
    }
    public void toPrint() {

        System.out.println();
        System.out.println("Queue List Is :-");
        for (Integer i : queue) {
            System.out.print(" " + i);
        }
    }
}
