package test;

import javax.swing.*;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("Hello world");
        JFrame jframe = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130,100,100, 40);
        jframe.add(b);
        jframe.setSize(400,500); // 400 width and 500 height
        jframe.setLayout(null);             // using no layout managers
        jframe.setVisible(true);            // making the frame visible
    }
}
