package hw3.driver;
import hw3.q1.QuestionOne;
import hw3.q2.QuestionTwo;
import hw3.q3.QuestionThree;

public class HomeworkThree {

    public static void main(String[] args) {
        System.out.println("Begin HW3");
        QuestionOne q1 = new QuestionOne();
        QuestionTwo q2 = new QuestionTwo();
        QuestionThree q3 = new QuestionThree();
        q1.analyzeFormula(1, 2, 0);
        System.out.println("Q2: " + q2.isValid("abcdefghhgfedecba"));
        System.out.println("Q3: " + q3.commonSubString("and", "art"));

    }
}
