package com.academy.kopats.lesson6;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
