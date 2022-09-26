package hw1.q1;

/*
Ezekiel Quintanilla
09/26/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class QuestionOne {
    // 1) Write a Java method that will take a string and reverse it. Can you come up with a method that is faster
    // than regular reversing of the for loop?
    public String strReverse(String input) {
        int start = 0;
        int end = input.length()-1;
        char tempChar;
        char[] tempArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            tempArray[i] = input.charAt(i);
        }
        while (start < end) {
            tempChar = tempArray[start];
            tempArray[start] = tempArray[end];
            tempArray[end] = tempChar;
            start++;
            end--;
        }
        String answer = new String(tempArray);
        return answer;
    }
}
