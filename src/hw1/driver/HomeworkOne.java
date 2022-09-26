package hw1.driver;

import java.util.Scanner;
import hw1.q1.QuestionOne;
import hw1.q2.QuestionTwo;
import hw1.q3.QuestionThree;
import hw1.q4.QuestionFour;
import hw1.q5.QuestionFive;

/*
Ezekiel Quintanilla
09/26/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class HomeworkOne {
    private double preFunctionMillis, postFunctionMillis;
    Scanner userInput = new Scanner(System.in);

    public void runQuestionOne() {
        QuestionOne q1 = new QuestionOne();
        // Question One
        System.out.println("\n===============");
        System.out.println("Question One Test");
        System.out.print("Please enter a string: ");
        String q1String = userInput.nextLine();
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("Input: " + q1String);
        System.out.println("Output: " + q1.strReverse(q1String));
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q1 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }
    public void runQuestionTwo() {
        QuestionTwo q2 = new QuestionTwo();
        // Question Two
        System.out.println("\n===============");
        System.out.println("Question Two Test");
        System.out.print("Please enter a string: ");
        String q2String = userInput.nextLine();
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("Input: " + q2String);
        System.out.println("Output: " + q2.strGenerator(q2String));
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q2 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }
    public void runQuestionThree() {
        QuestionThree q3 = new QuestionThree();
        // Question Three
        System.out.println("\n===============");
        System.out.println("Question Three Test");
        System.out.print("Please enter a number: ");
        int userInt = userInput.nextInt();
        while (userInt <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Please enter a number: ");
            userInt = userInput.nextInt();
        }
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("\nMissing number is " + q3.coinValue(userInt) + ".");
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q3 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }
    public void runQuestionFour() {
        QuestionFour q4 = new QuestionFour();
        // Question Four
        System.out.println("\n===============");
        System.out.println("Question Four Test");
        System.out.print("Please enter a number > 100: ");
        int userInt = userInput.nextInt();
        while (userInt <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Please enter a number > 100: ");
            userInt = userInput.nextInt();
        }
        preFunctionMillis = System.currentTimeMillis();
        int q4Value = q4.questionFour(userInt);
        if (q4Value >= 0) {
            System.out.println("Result: Position of 4 G's is " + q4Value + ".");
        } else {
            System.out.println("Result: No matching sequences");
        }
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q4 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }
    public void runQuestionFive() {
        QuestionFive q5 = new QuestionFive();
        // Question Five
        System.out.println("\n===============");
        System.out.println("Question Five Test");
        System.out.print("Enter an array size: ");
        int userArraySize = userInput.nextInt();
        System.out.print("\nEnter the number \nof places to shift: ");
        int userShiftPlaces = userInput.nextInt();
        while (userShiftPlaces < 0 || userArraySize <= userShiftPlaces) {
            if (userShiftPlaces > userArraySize) {
                System.out.println("Invalid input!");
                System.out.println("Array size must be greater than number of places to shift");
                System.out.println("Try again");
            } else {
                System.out.println("Invalid input!");
                System.out.println("Try again");
            }
            System.out.print("\nEnter an array size: ");
            userArraySize = userInput.nextInt();
            System.out.print("\nEnter the number \nof places to shift: ");
            userShiftPlaces = userInput.nextInt();
        }
        preFunctionMillis = System.currentTimeMillis();
        q5.arrayShift(userArraySize, userShiftPlaces);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q5 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public static void main(String[] args) {
        // Create HW Object
        HomeworkOne hw1 = new HomeworkOne();

        // Run tests
        System.out.println("HOMEWORK ONE\n");
        // Q1
        hw1.runQuestionOne();    // Success case
        hw1.runQuestionOne();    // Success case
        hw1.runQuestionOne();    // Failure case

        // Q2
        hw1.runQuestionTwo();    // Success case
        hw1.runQuestionTwo();    // Success case
        hw1.runQuestionTwo();    // Failure case

        // Q3
        hw1.runQuestionThree();  // Success case
        hw1.runQuestionThree();  // Success case
        hw1.runQuestionThree();  // Failure case

        // Q4
        hw1.runQuestionFour();   // Success case
        hw1.runQuestionFour();   // Success case
        hw1.runQuestionFour();   // Failure case

        // Q5
        hw1.runQuestionFive();   // Success case
        hw1.runQuestionFive();   // Success case
        hw1.runQuestionFive();   // Failure case
    }
}
