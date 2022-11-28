package hw3.driver;

import hw3.q1.QuestionOne;
import hw3.q2.QuestionTwo;
import hw3.q3.QuestionThree;
import hw3.q4.QuestionFour;
import java.util.Scanner;


public class HomeworkThree {
    Scanner userInput = new Scanner(System.in);
    private double preFunctionMillis, postFunctionMillis;

    public void runQuestionOne() {
        QuestionOne q1 = new QuestionOne();
        System.out.println("\n===============");
        System.out.println("Question One Test");

        // Get User Input
        System.out.println("Enter values for A, B, and C");
        System.out.print("A: ");
        double userIntA = userInput.nextDouble();
        System.out.print("B: ");
        double userIntB = userInput.nextDouble();
        System.out.print("C: ");
        double userIntC = userInput.nextDouble();
        System.out.println();

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        q1.analyzeFormula(userIntA, userIntB, userIntC);
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q1 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionTwo() {
        QuestionTwo q2 = new QuestionTwo();
        System.out.println("\n===============");
        System.out.println("Question Two Test");

        // Get User Input
        System.out.print("Enter any string of characters: ");
        String userString = userInput.next();

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        if (q2.isValid(userString)) {
            System.out.println("According to Hercule Poirot, the string is valid!");
        } else {
            System.out.println("According to Hercule Poirot, the string is invalid!");
        }
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q2 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionThree() {
        QuestionThree q3 = new QuestionThree();
        System.out.println("\n===============");
        System.out.println("Question Three Test");

        // Get User Input
        System.out.println("Please enter two strings");
        System.out.print("String 1: ");
        String userString1 = userInput.next();
        System.out.print("String 2: ");
        String userString2 = userInput.next();

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        if (q3.commonSubString(userString1, userString2)) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found!");
        }
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q3 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public void runQuestionFour() {
        QuestionFour q4 = new QuestionFour();
        System.out.println("\n===============");
        System.out.println("Question Four Test");
        System.out.println("In this simulation of an airport's TSA security line 1ms = 1 minute.");
        System.out.println("They have two queues to choose from: A and B");
        System.out.println("After their first queue, they enter queue C");

        // Get User Input
        System.out.println("Enter a value for the number of people entering an airport TSA line");
        System.out.print("Value: ");
        int userInt = userInput.nextInt();
        while (userInt <= 0) {
            System.out.println("Please enter a value greater than 0");
            System.out.print("Value: ");
            userInt = userInput.nextInt();
        }

        // Run Test
        preFunctionMillis = System.currentTimeMillis();
        try {
            q4.simulate(userInt);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q4 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Begin HW3");
        HomeworkThree hw3 = new HomeworkThree();

        // Q1
        hw3.runQuestionOne();      // Case 1
        hw3.runQuestionOne();      // Case 2
        hw3.runQuestionOne();      // Case 3

        // Q2
        hw3.runQuestionTwo();      // Case 1
        hw3.runQuestionTwo();      // Case 2
        hw3.runQuestionTwo();      // Case 3

        // Q3
        hw3.runQuestionThree();    // Case 1
        hw3.runQuestionThree();    // Case 2
        hw3.runQuestionThree();    // Case 3

        // Q4
        hw3.runQuestionFour();     // Case 1
        hw3.runQuestionFour();     // Case 2
        hw3.runQuestionFour();     // Case 3

        System.out.println("End HW3");
    }
}
