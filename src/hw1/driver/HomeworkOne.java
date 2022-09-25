package hw1.driver;

import java.util.Random;
import hw1.q1.QuestionOne;
import hw1.q2.QuestionTwo;
import hw1.q3.QuestionThree;
import hw1.q4.QuestionFour;

public class HomeworkOne {
    public String generateRandomString(int length) {
        StringBuilder randomStr = new StringBuilder();
        Random rand = new Random();
        char c;

        for (int i = 0; i < length; i++) {
            c = (char)(rand.nextInt(26) + 'a');
            if (randomStr.length() > 1 && randomStr.length() % 10 == 1) {
                randomStr.append("\n");
            }
            randomStr.append(c);
        }
        return randomStr.toString();
    }

    public static void main(String[] args) {
        double preFunctionMillis, postFunctionMillis;

        HomeworkOne hw1 = new HomeworkOne();
        QuestionOne q1 = new QuestionOne();
        QuestionTwo q2 = new QuestionTwo();
        QuestionThree q3 = new QuestionThree();
        QuestionFour q4 = new QuestionFour();

        String q1String = hw1.generateRandomString(10);
        String q2String = hw1.generateRandomString(5);

        // Question One Test
        System.out.println("\n===============");
        System.out.println("Question One Test");
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("Input: " + q1String);
        System.out.println("Output: " + q1.strReverse(q1String));
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q1 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");

        // Question Two Test
        System.out.println("\n===============");
        System.out.println("Question Two Test");
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("Input: " + q2String);
        System.out.println("Output: " + q2.strGenerator(q2String));
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q2 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");

        // Question Three Test
        System.out.println("\n===============");
        System.out.println("Question Three Test");
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("Missing number is " + q3.coinValue(6) + ".");
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Q3 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");

        // Question Three Test
        System.out.println("\n===============");
        System.out.println("Question Four Test");
        preFunctionMillis = System.currentTimeMillis();
        int q4Value = q4.questionFour(1028);
        if (q4Value >= 0) {
            System.out.println("Result: Position of 4 G's is " + q4Value + ".");
        } else {
            System.out.println("Result: No matching sequences");
        }
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("43 Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }
}
