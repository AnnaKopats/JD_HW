package com.academy.kopats.lesson21;

import java.util.Scanner;

public class ShapeFactory {
    public Shape getShape() {
        int a = 0, b = 0, c = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1 - треугольник, 2 - прямоугольник, 3 - круг, 4 - квадрат");
        int i = sc.nextInt();
        Shape shape = null;
        System.out.println("Введите параметры фигуры: ");
        if (i == 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            name = sc.nextLine();
            shape = new Triangle(a, b, c, name);
        } else if (i == 2) {
            a = sc.nextInt();
            b = sc.nextInt();
            name = sc.nextLine();
            shape = new Rectangle(a, b, name);
        } else if (i == 3) {
            a = sc.nextInt();
            name = sc.nextLine();
            shape = new Circle(a, name);
        } else if (i == 4) {
            a = sc.nextInt();
            name = sc.nextLine();
            shape = new Square(a, name);
        }
        return shape;
    }
}
