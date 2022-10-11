package hw2.q3;

import java.util.Random;

public class QuestionThree {
    /*
        3. Create an array of size N. The user supplies N. Use random integers to fill the array. Write a
        Java program to find maximum product of two integers in an array of integers and then print
        them.
        Example:
        Array = [2, 3, 5, 7, -7, 5, 8, -5]
        Pair is (7, 8), Maximum Product: 56
     */
    private int[] generateArray(int n) {
        Random rand = new Random();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rand.nextInt(n+n) - n;
        }
        return answer;
    }
    public void maxProduct(int n) {
        int[] intArray = generateArray(n);
        int max1 = -n - 1;
        int max2 = -n;
        int min1 = n + 1;
        int min2 = n;
        int product;
        System.out.println("Array for Max Product: ");
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (intArray[i] > max1) {
                max1 = intArray[i];
            }
            if (max1 > intArray[i] && intArray[i] > max2) {
                max2 = intArray[i];
            }
            if (intArray[i] < min1) {
                min1 = intArray[i];
            }
            if (min1 < intArray[i] && intArray[i] < min2) {
                min2 = intArray[i];
            }
        }
        System.out.println("Max1: " + max1);
        System.out.println("Max2: " + max2);
        System.out.println("Min1: " + min1);
        System.out.println("Min2: " + min2);
        if (max1*max2 > min1*min2) {
            product = max1 * max2;
            System.out.println("Max product is " + max1 + "*" + max2 + ": " + product);
        } else {
            product = min1 * min2;
            System.out.println("Max product is " + min1 + "*" + min2 + ": " + product);
        }
    }
}
