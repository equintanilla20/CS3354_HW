package hw2.q5;
import hw2.q5.Matrix;

public class QuestionFive {
    /*
        5. Matrix Operations
        You will create a general MxN matrix where M = number of rows and N = number columns that
        are specified by the user. Write a generic class of matrix that accepts user-defined N and M as
        input parameters and generates a random matrix. Each cell of the matrix is a random number.
        Example 1: Consider a 2x2 matrix: A = 23 54
        98 97 where A[i][j] is a random number between
        (0,99).
        Example 2: Consider a 3x3 matrix A =
        54 43 76
        12 98 34
        38 43 62
        where A[i][j] is a random number between (0,99).
        Thus, generate a random matrix A. Similarly, you can generate matrices of other dimensions by
        specifying user values M and N. Perform your operations on these matrices.
        Design and write Java codes that solves the following:
        • Matrix Addition (2x2, 3x5)
        • Matrix Multiplication (2x2, 3x5)
        Show your results with your set of examples. You are free to choose the values of M and N
     */
    private int[][] matrixOne;
    private int[][] matrixTwo;
    public void matrixAddition(int n, int m) {
        Matrix m1 = new Matrix(n, m);
        Matrix m2 = new Matrix(n, m);
        matrixOne = m1.getMatrix();
        matrixTwo = m2.getMatrix();
        int[][] sum = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(matrixOne, n, m);
        System.out.println("Matrix 2:");
        printMatrix(matrixTwo, n, m);
        System.out.println("Matrix sum:");
        printMatrix(sum, n, m);
    }
    public void matrixMultiplication(int n, int m, int o) {
        Matrix m1 = new Matrix(n, m);
        Matrix m2 = new Matrix(m, o);
        matrixOne = m1.getMatrix();
        matrixTwo = m2.getMatrix();
        int[][] product = new int[n][o];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                product[i][j] = cellProduct(matrixOne, matrixTwo, i, j);
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(matrixOne, n, m);
        System.out.println("Matrix 2:");
        printMatrix(matrixTwo, m, o);
        System.out.println("Matrix product:");
        printMatrix(product, n, o);
    }
    private int cellProduct(int[][] m1, int[][] m2, int row, int col) {
        int cell = 0;
        for (int i = 0; i < m2.length; i++) {
            cell += m1[row][i] * m2[i][col];
        }
        return cell;
    }
    private void printMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
}
