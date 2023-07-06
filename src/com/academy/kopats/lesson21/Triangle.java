package com.academy.kopats.lesson21;

import java.util.Scanner;

public class Triangle implements Shape {
    private int a;
    private int b;
    private int c;
    private String name;

    public Triangle(int a, int b, int c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }


    @Override
    public Shape requestParamShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры фигуры: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        name = sc.nextLine();
        return new Triangle(a, b, c, name);
    }

    @Override
    public double getArea() {
        int sum = a + b + c;
        double p = sum / 2.0;
        System.out.println("Площадь треугольника равна: ");
        return p * (p - a) * (p - b) * (p - c);
    }


    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
