package hw1.q5;

/*
Ezekiel Quintanilla
09/26/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class QuestionFive {
    // 5) Write a Java method that will take an array of integers of size n and shift right by m places, where n >
    // m. You can read your inputs from a file and write your outputs to another file.
    int[] generateArray(int n) {
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = (i + 1);
        }
        return intArray;
    }

    public void arrayShift(int n, int m) {
        int temp, toMove, moves;
        int[] intArray = generateArray(n);

        moves = m;
        temp = intArray[0];

        System.out.print("Original: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        while (moves > 0) {
            for (int i = 0; i < intArray.length; i++) {
                toMove = temp;
                if (i+1 < intArray.length) {
                    temp = intArray[i + 1];
                    intArray[i + 1] = toMove;
                } else {
                    temp = toMove;
                    intArray[0] = toMove;
                }
            }
            moves--;
        }
        System.out.print("Shifted: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
