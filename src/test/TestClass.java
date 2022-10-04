package test;

//import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
public class TestClass {

    public static void main(String[] args) {
        Game newGame = new Game(Environment.DESERT);
        System.out.println("Player ID: " + newGame.getId());
        System.out.println("Environment: " + newGame.getEnvironment());
//        Random rand = new Random();
//        int n = 6;
//        int temp;
//        int x = rand.nextInt(n);
//        ArrayList<Integer> testArray = new ArrayList<>();
//        while (testArray.size() < n) {
//            temp = rand.nextInt(n) + 1;
//            if (temp < 0) {
//                temp = temp * -1;
//            }
//            if (!testArray.contains(temp)) {
//                testArray.add(temp);
//            }
//        }
//        testArray.set(x, 0);
//        System.out.println("Array: ");
//        for (int i : testArray) {
//            System.out.println(i);
//        }

//        JFrame jframe = new JFrame();
//        JButton b = new JButton("Click");
//        b.setBounds(130,100,100, 40);
//        jframe.add(b);
//        jframe.setSize(400,500); // 400 width and 500 height
//        jframe.setLayout(null);             // using no layout managers
//        jframe.setVisible(true);            // making the frame visible
    }
}
