package test;

import java.util.HashMap;
import java.util.Map;

//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.Random;
public class TestClass {

//    public int romanToInt(String s) {
//        int result = 0;
//        Map<Character, Integer> romanNums = new HashMap<Character, Integer>();
//        romanNums.put('I', 1);
//        romanNums.put('V', 5);
//        romanNums.put('X', 10);
//        romanNums.put('L', 50);
//        romanNums.put('C', 100);
//        romanNums.put('D', 500);
//        romanNums.put('M', 1000);
//
//        for (int i = s.length()-2; i >= 0; i--) {
//            if (romanNums.get(s.charAt(i)) >= romanNums.get(s.charAt(i+1))) {
//                result += romanNums.get(s.charAt(i));
//            } else {
//                result -= romanNums.get(s.charAt(i));
//            }
//        }
//
//        return result;
//    }

    public int romanToInt(String s) {
        // Map to store romans numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        // Fill the map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        // Length of the given string
        int n = s.length();
        // Variable to store result
        int num = romanMap.get(s.charAt(n - 1));
        // Loop for each character from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Check if the character at right of current character is
            // bigger or smaller
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        TestClass leetCode = new TestClass();
        String testString = "III";
        System.out.println("Test: " + testString);
        System.out.println("Result: " + leetCode.romanToInt(testString));
    }
}
