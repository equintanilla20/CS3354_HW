package hw2.driver;
import hw2.q1.QuestionOne;
import hw2.q2.QuestionTwo;
import hw2.q3.QuestionThree;
import hw2.q4.QuestionFour;
import hw2.q5.QuestionFive;

public class HomeworkTwo {
    public static void main(String[] args) {
//        HomeworkTwo hw2 = new HomeworkTwo();
//        QuestionOne q1 = new QuestionOne();
//        QuestionTwo q2 = new QuestionTwo();
//        QuestionThree q3 = new QuestionThree();
//        QuestionFour q4 = new QuestionFour();
        QuestionFive q5 = new QuestionFive();

//        q1.findDuplicates(10);
//        q2.minMax(10);
//        q3.maxProduct(25);
        System.out.println("===== Addition=====");
        q5.matrixAddition(2, 2);
        System.out.println("\n===== Multiplication =====");
        q5.matrixMultiplication(2, 3, 2);
    }

}
