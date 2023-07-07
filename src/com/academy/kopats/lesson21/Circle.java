package com.academy.kopats.lesson21;

import java.util.Scanner;

public class Circle implements Shape {
    private double r;
    private String name;

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public Shape requestParamShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры фигуры: ");
        r = sc.nextInt();
        name = sc.nextLine();
        setR(r);
        setName(name);
        return this;
    }

    @Override
    public double getArea() {
        System.out.println("Площадь круга равна: ");
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
