package hw3.q1;

import static java.lang.Math.sqrt;

/*
Ezekiel Quintanilla
11/28/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

public class RealNumber extends NumberQ1 {
    private double p;
    private double q;

    RealNumber(double a, double b, double c) {
        super(a, b, c);
        findPQ();
    }

    protected void showFormula() {
        System.out.println("Formula: " + (a + "x^2 + " + b + "x + " + c + " = 0"));
    }

    protected void findPQ() {
        double sqrtValue = (b * b) - 4 * a * c;
        p = (-b + sqrt(sqrtValue)) / (2 * a);
        q = (-b - sqrt(sqrtValue)) / (2 * a);
    }

    public void reportPQ() {
        System.out.println("\n-b / a = " + df.format((-b / a)));
        System.out.println(" p + q = " + df.format(( p + q)));
        System.out.println("\n c / a = " + df.format(( c / a)));
        System.out.println(" p * q = " + df.format(( p * q)));
    }
}
