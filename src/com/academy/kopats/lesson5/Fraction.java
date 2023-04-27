package com.academy.kopats.lesson5;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
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


    public Fraction add(Fraction f) {
        return new Fraction((this.numerator * f.denominator + f.numerator * this.denominator), this.denominator * f.denominator);
    }

    public Fraction divide(int numerator) {
        if (numerator == 0) {
            System.out.println("Ошибка! Знаменатель не может быть равен 0!");
        }
        return new Fraction(this.numerator * 1, this.denominator * numerator);
    }

    public Fraction multiply(int numerator) {
        return new Fraction(this.numerator * numerator, denominator * 1);
    }


    public String printFraction() {
        return numerator + "/" + denominator;
    }

}

