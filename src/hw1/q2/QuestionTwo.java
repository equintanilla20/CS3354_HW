package hw1.q2;

import java.util.Stack;

public class QuestionTwo {
    // 2) Write a Java program that generates a new string by concatenating the reversed substrings of even
    // indexes and odd indexes separately from a given string. For this code you may use the above method to
    // reverse the string.
    public String strGenerator(String input) {

        StringBuilder answer = new StringBuilder();
        Stack<Character> odds = new Stack<Character>();
        Stack<Character> evens = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if ((i+1) % 2 == 0) {
                evens.push(input.charAt(i));
            } else {
                odds.push(input.charAt(i));
            }
        }
        while (!odds.isEmpty()) {
            answer.append(odds.pop());
        }
        while (!evens.isEmpty()) {
            answer.append(evens.pop());
        }
        return answer.toString();
    }
}
