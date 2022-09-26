package hw1.q3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class QuestionThree {
    // 3) In a bag there are N distinct coins. Each coin has a value between 1 and N. However, there is one coin
    // that is marked X. How will you find the value of X in an efficient way?
    public Integer[] generateArray(int n) {
        Random rand = new Random();
        Integer[] answer = new Integer[n];
        int temp;
        int x = rand.nextInt(n);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (arrayList.size() < n) {
            temp = rand.nextInt(n) + 1;
            if (!arrayList.contains(temp)) {
                arrayList.add(temp);
            }
        }
        arrayList.set(x, 0);

        answer = arrayList.toArray(answer);
        return answer;
    }

    public int coinValue (int n) {
        Integer[] array;
        array = generateArray(n);
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        System.out.print("Array: ");
        for (int i : array) {
            actualSum += i;
            if (i == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        return (expectedSum - actualSum);
    }
}
