package hw3.driver;
import hw3.q1.QuestionOne;
import hw3.q2.QuestionTwo;

public class HomeworkThree {

    public static void main(String[] args) {
        System.out.println("Begin HW3");
        QuestionOne q1 = new QuestionOne();
        QuestionTwo q2 = new QuestionTwo();
//        q1.analyzeFormula(1, 2, 0);
        System.out.println("Q2: " + q2.isValid("abcdefghhgfedecba"));

    }
}
