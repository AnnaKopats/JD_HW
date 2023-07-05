package com.academy.kopats.lesson21;

import com.academy.kopats.lesson20.Product;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private String name;

    public Triangle(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        System.out.println("Площадь треугольника равна: ");
        return p * (p - a) * (p - b) * (p - c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
