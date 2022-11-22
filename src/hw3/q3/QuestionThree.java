package hw3.q3;

import java.util.HashSet;
import java.util.Set;

public class QuestionThree {
    /*
    3. Find common substrings
    Write a Java program that takes two strings S1 and S2 and test (returns boolean) if they share a common
    substring (don’t return the substrings). A substring may be as small as one character.
    */
    public boolean commonSubString(String s1, String s2) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            letters.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!letters.add(s2.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
