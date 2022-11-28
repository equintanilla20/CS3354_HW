package hw3.q1;

import java.text.DecimalFormat;

/*
Ezekiel Quintanilla
11/28/2022
CS 3354: Object-Oriented Design and Programming
S Roychowdhury
*/

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
