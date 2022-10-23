package test;

//import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
public class TestClass {
    private void testLocalClass(int b1, int c) {
        int b = b1;
        class A {
            int a = 0;
            public void setA(int a) {
                this.a = a;
                this.a = c + b;
            }
                public void print() { System.out.println("a=" + a); }
        }
        A ac = new A();
        ac.setA(c);
        ac.print();
        System.out.println("b1=" + b);
    }
    public static void main(String[] args) {
        TestClass example = new TestClass();
        example.testLocalClass(5, 6);
    }
}
