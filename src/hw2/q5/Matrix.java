package hw2.q5;
import java.util.Random;

/*
Ezekiel Quintanilla
10/14/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class Matrix {
    private int[][] matrix;

    Matrix(int N, int M) {
        matrix = new int[N][M];
    }

    public int[][] generateMatrix() {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(99);
            }
        }
        return matrix;
    }
}