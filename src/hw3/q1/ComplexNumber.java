package hw3.q1;

import static java.lang.Math.abs;

/*
Ezekiel Quintanilla
11/28/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class ComplexNumber extends NumberQ1 {
    private String complexP;
    private String complexQ;

    ComplexNumber(double a, double b, double c) {
        super(a, b, c);
        findPQ();
    }

    protected void showFormula() {
        System.out.println("Formula: " + (a + "x^2 + " + b + "x + " + c + " = 0"));
    }

    protected void findPQ() {
        double sqrtValue = (b * b) - 4 * a * c;
        complexP = "(" + -b + " - sqrt(" + df.format(abs(sqrtValue)) + ")i) / " + df.format((2*a));
        complexQ = "(" + -b + " + sqrt(" + df.format(abs(sqrtValue)) + ")i) / " + df.format((2*a));
    }

    public void reportPQ() {
        System.out.println("\n-b / a = " + df.format((-b / a)));        // Show -b / a
        System.out.println(" p + q = " + complexP + " + " + complexQ);  // Show  p + q
        System.out.println("\n c / a = " + df.format(( c / a)));        // Show  c / a
        System.out.println(" p * q = " + complexP + " * " + complexQ);  // Show  p * q
    }
}
