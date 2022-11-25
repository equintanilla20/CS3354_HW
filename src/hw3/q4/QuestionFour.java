package hw3.q4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QuestionFour extends Thread {
    /*
    4. Simulate 3-Queue System
    */
    private Random rand = new Random();
    private char type;
    private int finished;
    Queue<Person> queueA = new LinkedList<>();
    Queue<Person> queueB = new LinkedList<>();
    Queue<Person> queueC = new LinkedList<>();

    public QuestionFour() {
        type = ' ';
    }

    QuestionFour(char type) {
        this.type = type;
    }

    private Person arrival() {
        int waitTime = rand.nextInt(15) + 1;
        Person person = new Person(waitTime);
        return person;
    }

    public void run() {
        if (type == 'A') {
            while (queueA.isEmpty()) {}
            try {
                System.out.println("A: " + queueA.peek().getWaitTime());
                wait(queueA.peek().getWaitTime());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queueC.add(queueA.remove());
        } else if (type == 'B') {
            while (queueB.isEmpty()) {}
            try {
                System.out.println("B: " + queueB.peek().getWaitTime());
                wait(queueB.peek().getWaitTime());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queueC.add(queueB.remove());
        } else {
            while (queueC.isEmpty()) {}
            try {
                System.out.println("C: " + queueC.peek().getWaitTime());
                wait(queueC.peek().getWaitTime());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finished++;
            queueC.remove();
        }
    }

    public void simulate() {
        QuestionFour checkerA = new QuestionFour('A');
        QuestionFour checkerB = new QuestionFour('B');
        QuestionFour checkerC = new QuestionFour('C');
        queueA.add(arrival());
        checkerA.start();
        checkerB.start();
        checkerC.start();
        while (finished < 50) {
            if (rand.nextInt(2) == 1) {
                queueA.add(arrival());
            } else {
                queueB.add(arrival());
            }
        }
    }

}
