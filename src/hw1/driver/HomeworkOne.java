package hw1.driver;

import java.util.Random;
import hw1.q1.QuestionOne;

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
        String testString = hw1.generateRandomString(1000);
        preFunctionMillis = System.currentTimeMillis();
        System.out.println("Input: " + testString);
        System.out.println("Output: " + q1.strReverse(testString));
        postFunctionMillis = System.currentTimeMillis();
        System.out.println("Time Elapsed 1: " + (postFunctionMillis - preFunctionMillis) + " ms\n");



    }
}
