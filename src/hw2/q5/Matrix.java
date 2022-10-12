package hw2.q5;
import java.util.Random;

public class Matrix {
    private int[][] matrix;
    Matrix(int N, int M) {
        matrix = new int[N][M];
        generateMatrix(N, M);
    }

    public void generateMatrix(int N, int M) {
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = rand.nextInt(3);
            }
        }
    }
    public int[][] getMatrix() {
        return matrix;
    }
//    public static void main(String[] args) {
//        Matrix testMatrix = new Matrix(2, 2);
//        testMatrix.generateMatrix();
//        int[][] m1 = testMatrix.getMatrix();
//    }
}
