package hw0;
import java.util.Random;

public class HomeworkZero {

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
        HomeworkZero hw0 = new HomeworkZero();
        Random rand = new Random();
        double preFunctionMillis, postFunctionMillis;
        int length = rand.nextInt(1000000);

        preFunctionMillis = System.currentTimeMillis();
        System.out.println(hw0.generateRandomString(length));
        postFunctionMillis = System.currentTimeMillis();

        System.out.println("Time Elapsed: " + (postFunctionMillis - preFunctionMillis) + " ms");
    }
}