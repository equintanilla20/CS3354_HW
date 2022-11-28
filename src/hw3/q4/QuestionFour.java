package hw3.q4;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
Ezekiel Quintanilla
11/28/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class QuestionFour {
    /*
    4. Simulate 3-Queue System
    */
    final private Random rand = new Random();
    private int arrivals = 0;
    private int finished = 0;
    private int time = 0;
    final private int A_MAX = 20;
    final private int B_MAX = 30;
    final private int C_MAX = 10;

    private Person arrival() throws InterruptedException {
        Person p = new Person(rand.nextInt(15) + 1, rand.nextInt(5) + 1);
        Thread.sleep(p.getInterArrivalTime());
        time += p.getInterArrivalTime();
        System.out.println("Person arrives at time: " + time + " minute(s)");
        arrivals++;
        return p;
    }

    private void processPerson(long p) {
        try {
            Thread.sleep(p);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void finished() { finished++; }

    public void simulate(int N) throws InterruptedException {

        BlockingQueue<Person> queueA = new ArrayBlockingQueue<>(A_MAX);
        BlockingQueue<Person> queueB = new ArrayBlockingQueue<>(B_MAX);
        BlockingQueue<Person> queueC = new ArrayBlockingQueue<>(C_MAX);

        final Runnable tsaEntrance = () -> {
            while (arrivals < N) {
                try {
                    if (rand.nextBoolean() && queueA.size() < A_MAX) {
                        queueA.add(arrival());
                    } else if (queueB.size() < B_MAX) {
                        queueB.add(arrival());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("No more arrivals!");
        };

        new Thread(tsaEntrance).start();

        final Runnable agentA = () -> {
            while (finished < N) {
                synchronized(queueC) {
                    if (!queueA.isEmpty() && queueC.size() < C_MAX) {
                        System.out.println("Agent A processing for: " + queueA.peek().getWaitTime() + " minute(s)");
                        assert queueA.peek() != null;
                        processPerson(queueA.peek().getWaitTime());
                        queueC.add(queueA.remove());
                    }
                }
            }
        };

        final Runnable agentB = () -> {
            while (finished < N) {
                synchronized (queueC) {
                    if (!queueB.isEmpty() && queueC.size() < C_MAX) {
                        System.out.println("Agent B processing for: " + queueB.peek().getWaitTime() + " minute(s)");
                        assert queueB.peek() != null;
                        processPerson(queueB.peek().getWaitTime());
                        queueC.add(queueB.remove());
                    }
                }
            }
        };

        new Thread(agentA).start();
        new Thread(agentB).start();

        final Runnable agentC = () -> {
            while (finished < N) {
                if (!queueC.isEmpty()) {
                    System.out.println("Agent C processing for: " + queueC.peek().getWaitTime() + " minute(s)");
                    assert queueC.peek() != null;
                    processPerson(queueC.peek().getWaitTime());
                    queueC.remove();
                    finished();
                    System.out.println("Finished: " + finished);
                }
            }
            System.out.println("All people processed!");
        };
        new Thread(agentC).start();
        Thread.sleep(10000);
    }

}
