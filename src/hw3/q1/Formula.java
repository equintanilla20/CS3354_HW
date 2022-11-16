package hw3.q1;

import static java.lang.Math.sqrt;

public class Formula {
    String complexP = null;
    String complexQ = null;
    private final double a;
    private final double b;
    private final double c;
    private Double p;
    private Double q;

    Formula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        showFormula();
    }

    private void showFormula() {
        System.out.println(a + "x^2 + " + b + "x + " + c);
    }

    public void findPQ() {
        double sqrtValue = (b*b)-4*a*c;
        if (isComplexRoot(sqrtValue)) {
            complexP = "(" + -b + " + sqrt(" + sqrtValue + ")i) / " + (2*a);
            System.out.println(complexP);
            p = null;
            complexQ = "(" + -b + " - sqrt(" + sqrtValue + ")i) / " + (2*a);
            q = null;
        } else {
            p = (-b + sqrt(sqrtValue)) / (2 * a);
            q = (-b - sqrt(sqrtValue)) / (2 * a);
        }

    }

    private boolean isComplexRoot(double sqrtValue) {
        return sqrtValue < 0;
    }

    public void showBOverA() {
        double quotient = -b/a;
        if (quotient != quotient) {
            System.out.println("-b / a = UNDEFINED");
        } else {
            System.out.println("-b / a = " + quotient);
        }
    }

    public void showPPlusQ() {
        if (p != null && q != null) {
            System.out.println("p + q = " + complexP + " + " + complexQ);
        } else {
            System.out.println("p + q = " + (p + q));
        }
    }

    public void showCOverA() {
        double quotient = c/a;
        if (quotient != quotient) {
            System.out.println("c / a = UNDEFINED");
        } else {
            System.out.println("c / a = " + quotient);
        }
    }

    public void showPTimesQ() {
        if (p != null && q != null) {
            System.out.println("p * q = " + (p * q));
        } else {
            System.out.println("p * q = " + complexP + " * " + complexQ);
        }
    }
}
