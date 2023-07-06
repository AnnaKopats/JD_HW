package com.academy.kopats.lesson21;

import java.util.Scanner;

public class Square implements Shape {
    private double a;
    private String name;

    public Square(double a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public double getArea() {
        System.out.println("Площадь квадрата равна: ");
        return a * a;
    }

    public Shape requestParamShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры фигуры: ");
        a = sc.nextInt();
        name = sc.nextLine();
        return new Square(a, name);
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
