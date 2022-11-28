package hw3.q4;

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
