package com.academy.kopats.lesson21;

import java.util.Scanner;

public class ShapeFactory {
    public Shape getShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1 - треугольник, 2 - прямоугольник, 3 - круг, 4 - квадрат");
        int i = sc.nextInt();
        Shape shape = null;
        int a = 0, b = 0, c = 0;
        String name = null;
        if (i == 1) {
            shape = new Triangle(a, b, c, name);
        } else if (i == 2) {
            shape = new Rectangle(a, b, name);
        } else if (i == 3) {
            shape = new Circle(a, name);
        } else if (i == 4) {
            shape = new Square(a, name);
        }
        return shape;
    }
}