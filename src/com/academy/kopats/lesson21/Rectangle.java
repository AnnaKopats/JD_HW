package com.academy.kopats.lesson21;

import java.util.Scanner;

public class Rectangle implements Shape {
    private int a;
    private int b;

    private String name;

    public Rectangle(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    @Override
    public double getArea() {
        System.out.println("Площадь прямоугольника равна: ");
        return a * b;
    }

    public Shape requestParamShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры фигуры: ");
        a = sc.nextInt();
        b = sc.nextInt();
        name = sc.nextLine();
        return new Rectangle(a, b, name);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
