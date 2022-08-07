package com.bridgelabz;

public class QueueMain {
    public static void main(String[] args) {

        QueueFunction queueOperation = new QueueFunction();

        queueOperation.enQueue(56);
        queueOperation.enQueue(30);
        queueOperation.enQueue(70);
        queueOperation.toPrint();


        queueOperation.deQueue();
        queueOperation.toPrint();
        queueOperation.deQueue();
        queueOperation.toPrint();
        queueOperation.deQueue();
        queueOperation.toPrint();
        queueOperation.deQueue();
    }
}
