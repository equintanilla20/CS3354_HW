package hw3.q1;

import java.text.DecimalFormat;

abstract class NumberQ1 {
    static final DecimalFormat df = new DecimalFormat("0.00");
    double a;
    double b;
    double c;

    NumberQ1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        showFormula();
    }

    abstract void showFormula();
    abstract void findPQ();
    abstract void reportPQ();
}
