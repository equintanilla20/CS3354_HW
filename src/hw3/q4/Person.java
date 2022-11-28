package hw3.q4;

/*
Ezekiel Quintanilla
11/28/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class Person {
    private final long waitTime;
    private final long interArrivalTime;
    Person(int waitTime, int interArrivalTime) {
        this.waitTime = waitTime;
        this.interArrivalTime = interArrivalTime;
    }
    public long getWaitTime() { return waitTime; }
    public long getInterArrivalTime() { return interArrivalTime; }
}
