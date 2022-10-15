package hw2.q2;

import java.util.Random;

/*
Ezekiel Quintanilla
10/14/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class QuestionTwo {
    /*
        2. Create an array of size N. The user supplies N. Use random integers to fill the array. Find
        maximum and minimum entries and print them. Don’t use max and min library functions.
                Example:
        Array = [3, 5, -26, 7, 8, 10, 1, 8, 1, 2]
        maximum: 10
        minimum: -26
    */

    private int[] generateArray(int n) {
        Random rand = new Random();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rand.nextInt(n+n) - n;
        }
        return answer;
    }
    public void minMax(int n) {
        int[] intArray = generateArray(n);
        int max = -n;
        int min = n;
        System.out.println("Array to find min & max:");
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("\nMax Value: " + max);
        System.out.println("Min Value: " + min);
    }
}
