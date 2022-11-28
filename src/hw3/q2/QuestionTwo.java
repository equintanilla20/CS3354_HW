package hw3.q2;

import java.util.HashMap;
import java.util.Map;

/*
Ezekiel Quintanilla
11/28/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class QuestionTwo {
    /*
    2. Write a Java method (isValid) that takes a
    string and determines if it is valid or not. Return True for valid string, otherwise return False.
    */
    public boolean isValid(String input) {
        Map<Character, Integer> letters = new HashMap<>();
        int prev;
        int tooManyCount = 0;

        for (int i = 0; i < input.length(); i++) {
            letters.merge(input.charAt(i), 1, Integer::sum);
        }
        System.out.println(letters);
        prev = letters.get(input.charAt(0));
        for (Map.Entry<Character, Integer> c : letters.entrySet()) {
            if (c.getValue() == (prev + 1) || c.getValue() == (prev - 1)) {
                tooManyCount++;
            } else if (c.getValue() > (prev + 1) || c.getValue() < (prev - 1)) {
                return false;
            }
        }
        return tooManyCount < 2;
    }
}
