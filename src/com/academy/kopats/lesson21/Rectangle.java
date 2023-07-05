package com.academy.kopats.lesson21;

public class Rectangle implements Shape {
    private double a;
    private double b;

    private String name;

    public Rectangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    @Override
    public double getArea() {
        System.out.println("Площадь прямоугольника равна: ");
        return a * b;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
