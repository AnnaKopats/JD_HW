package com.academy.kopats.lesson21;

public class Square implements Shape{
    private double a;
    private String name;

    public Square(double a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public double getArea() {
        System.out.println("Площадь квадрата равна: ");
        return a*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
