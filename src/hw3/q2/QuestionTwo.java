package hw3.q2;

import java.util.HashMap;
import java.util.Map;

public class QuestionTwo {
    /*
    2. Strange string validity of Hercule Poirot
    Mr. Hercule Poirot considers a string to be valid if all characters of the string appear the same number of
    times. In his opinion it is also valid if he can remove just character at index in the string, and the
    remaining characters will occur the same number of times. Write a Java method (isValid) that takes a
    string and determines if it is valid or not. Return True for valid string, otherwise return False.
    */
    public boolean isValid(String input) {
        Map<Character, Integer> alphabet = new HashMap<>();
        int prev;
        int tooManyCount = 0;

        for (int i = 0; i < input.length(); i++) {
            alphabet.merge(input.charAt(i), 1, Integer::sum);
        }
        System.out.println(alphabet);
        prev = alphabet.get(input.charAt(0));
        for (Map.Entry<Character, Integer> c : alphabet.entrySet()) {
            if (c.getValue() == (prev + 1) || c.getValue() == (prev - 1)) {
                tooManyCount++;
                System.out.println(tooManyCount);
            } else if (c.getValue() > (prev + 1) || c.getValue() < (prev - 1)) {
                return false;
            }
        }
        return tooManyCount < 2;
    }
}
