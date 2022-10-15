package hw2.driver;
import hw2.q1.QuestionOne;
import hw2.q2.QuestionTwo;
import hw2.q3.QuestionThree;
import hw2.q4.QuestionFour;
import hw2.q5.QuestionFive;
import java.util.Scanner;

/*
Ezekiel Quintanilla
10/14/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class HomeworkTwo {
    private double preFunctionMillis, postFunctionMillis;
    Scanner userInput = new Scanner(System.in);

    public void runQuestionOne() {
        QuestionOne q1 = new QuestionOne();

        System.out.println("\n===============");
        System.out.println("Question One Test");

        // Get User Input
        System.out.print("Enter Array Size: ");
        int userInt = userInput.nextInt();
        while (userInt <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Please enter a number: ");
            userInt = userInput.nextInt();
        }

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        q1.findDuplicates(userInt);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q1 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionTwo() {
        QuestionTwo q2 = new QuestionTwo();

        System.out.println("\n===============");
        System.out.println("Question Two Test");

        // Get User Input
        System.out.print("Enter Array Size: ");
        int userInt = userInput.nextInt();
        while (userInt <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Please enter a number: ");
            userInt = userInput.nextInt();
        }

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        q2.minMax(userInt);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q2 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionThree() {
        QuestionThree q3 = new QuestionThree();

        System.out.println("\n===============");
        System.out.println("Question Three Test");

        // Get User Input
        System.out.print("Enter Array Size: ");
        int userInt = userInput.nextInt();

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        q3.maxProduct(userInt);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q3 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionFour() {
        QuestionFour q4 = new QuestionFour();

        System.out.println("\n===============");
        System.out.println("Question Four Test");

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        q4.getRootThenList();
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q4 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionFive() {
        QuestionFive q5 = new QuestionFive();

        System.out.println("\n===============");
        System.out.println("Question Five Test");

        System.out.println("ADDITION");
        // Get User Input
        System.out.print("Enter Number of Rows: ");
        int userIntN = userInput.nextInt();
        while (userIntN <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Enter Number of Rows: ");
            userIntN = userInput.nextInt();
        }
        System.out.print("Enter Number of Columns: ");
        int userIntM = userInput.nextInt();
        while (userIntM <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Enter Number of Columns: ");
            userIntM = userInput.nextInt();
        }

        preFunctionMillis = System.currentTimeMillis();
        q5.matrixAddition(userIntN, userIntM);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q5 Addition Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");

        System.out.println("\nMULTIPLICATION");
        // Get User Input
        System.out.print("Enter Number of Rows for Matrix 1: ");
        userIntN = userInput.nextInt();
        System.out.println("Enter Number of Columns for");
        System.out.print("Matrix 1 and rows of Matrix 2: ");
        userIntM = userInput.nextInt();
        System.out.print("Enter Number of Columns for Matrix 2: ");
        int userIntO = userInput.nextInt();

        preFunctionMillis = System.currentTimeMillis();
        q5.matrixMultiplication(userIntN, userIntM, userIntO);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q5 Multiplication Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public static void main(String[] args) {
        HomeworkTwo hw2 = new HomeworkTwo();
        System.out.println("HOMEWORK TWO");
        System.out.println("Ezekiel Quintanilla");
//        // Question 1
//        hw2.runQuestionOne();
//
//        // Question 2
//        hw2.runQuestionTwo();
//
//        // Question 3
//        hw2.runQuestionThree();
//
//        // Question 4
        hw2.runQuestionFour();

        // Question 5
//        hw2.runQuestionFive();
    }
}