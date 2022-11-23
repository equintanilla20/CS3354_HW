package hw3.q4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QuestionFour {
    /*
    4. Simulate 3-Queue System
    */
    private Random rand = new Random();
    Queue<Person> queueA = new LinkedList<>();
    Queue<Person> queueB = new LinkedList<>();
    Queue<Person> queueC = new LinkedList<>();
    private Person arrival() {
        int waitTime = rand.nextInt(15) + 1;
        Person person = new Person(waitTime);
        return person;
    }

    public void simulate() {
        Thread tsaCheckerA = new TSA(queueA, queueC);
        Thread tsaCheckerB = new TSA(queueB, queueC);
        Thread tsaCheckerC = new TSA(queueC);

        while (true) {
            if (rand.nextInt(2) == 1) {

            }
            tsaCheckerA.start();
            tsaCheckerB.start();
            tsaCheckerC.start();
        }
    }

}
