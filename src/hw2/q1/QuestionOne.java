package hw2.q1;

import java.util.Random;

/*
Ezekiel Quintanilla
10/14/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class QuestionOne {
    /*
        1. Create a random array of size N (N=50). The user supplies parameter N. Use random integers
        to fill in the array. The random numbers must be between 1 and 100. Use Random.nextInt() to generate a random
        integer. Find duplicate entries if there are any and print them. You need not count the number
        of duplicates. If there are no duplicates, then please let the user know that there are no
        duplicates by providing an appropriate response message.
        Example:
        Array = [3, 5, -26, 7, 8, 10, 1, 8, 1, 2]
        Duplicate Entries: 8,1
    */

    private int[] generateArray(int n) {
        Random rand = new Random();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rand.nextInt(10) + 1;
        }
        return answer;
    }

    public void findDuplicates(int n) {
        int[] intArray = generateArray(n);
        int[] dupes = new int[n];
        for (int i = 0; i < n; i++) {
            dupes[intArray[i]%n] = intArray[i];
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
