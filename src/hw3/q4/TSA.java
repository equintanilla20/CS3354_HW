package hw3.q4;

import java.util.LinkedList;
import java.util.Queue;

public class TSA extends Thread {
    Queue<Person> tsaQueue;
    Queue<Person> nextQueue;
    public int doneCount = 0;
    private int checkQueueLength() {
        return tsaQueue.size();
    }

    private void processPerson() throws InterruptedException {
        wait(tsaQueue.peek().getWaitTime());
    }

    private Person removePerson() {
        doneCount++;
        return tsaQueue.remove();
    }

    public void run() {
        if (nextQueue == null) {
            checkQueueLength();
            try {
                processPerson();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            removePerson();
        } else {
            checkQueueLength();
            try {
                processPerson();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            removePerson();
            nextQueue.add(removePerson());
        }
    }

    TSA(Queue<Person> tsaQueue) {
        this.tsaQueue = tsaQueue;
    }
    TSA(Queue<Person> tsaQueue, Queue<Person> nextQueue) {
        this.tsaQueue = tsaQueue;
        this.nextQueue = nextQueue;
    }
}
