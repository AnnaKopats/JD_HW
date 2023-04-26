package com.academy.kopats.lesson5;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(Fraction f) {
        setValue(f);
    }


    public Fraction(int numerator, int denominator) {
        setValue(numerator, denominator);
    }


    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        setValue(numerator, this.denominator);
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        setValue(this.numerator, denominator);

    }

    public void setValue(int numerator, int denominator) {
        if (denominator == 0) System.out.println("Ошибка! Знаменатель не может быть равен 0!");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setValue(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    private void add(int numerator, int denominator) {
        this.numerator = this.numerator * denominator + numerator * this.denominator;
        this.denominator *= denominator;
    }

    public void add(Fraction f) {
        add(f.numerator, f.denominator);
    }

    public void divide(int numerator) {
        if (numerator == 0) {
            System.out.println("Ошибка! Знаменатель не может быть равен 0!");
        } else {
            this.denominator = this.denominator * numerator;
        }
    }

    public void multiply(int numerator) {
        this.numerator = this.numerator * numerator;
    }


    public String printFraction() {
        return numerator + "/" + denominator;
    }

}

