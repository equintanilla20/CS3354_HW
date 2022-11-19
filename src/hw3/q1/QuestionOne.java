package hw3.q1;

public class QuestionOne {
    /*
    1. Quadratic Equation
    Design and write a Java code that solves a quadratic equation ax^2 + bx + c = 0. Please use class and
    object definitions and do not use procedural style.
    Let the roots of ax^2 + bx + c = 0 be p and q. Show that the following:
            p + q = -b/a and pq = c/a
    for non-trivial a, b, c. Make sure that you address that complex numbers as objects.
    */
    public void analyzeFormula(double a, double b, double c) {
        if (!isNumComplex(a, b, c)) {
            NumberQ1 realNum = new RealNumber(a, b, c);
            realNum.reportPQ();
        } else {
            NumberQ1 complexNum = new ComplexNumber(a, b, c);
            complexNum.reportPQ();
        }
    }

    private boolean isNumComplex(double a, double b, double c) {
        return ((b * b) - 4 * a * c) < 0;
    }
}
