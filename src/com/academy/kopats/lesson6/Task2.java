package com.academy.kopats.lesson6;

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"Круг");
        Rectangle rectangle = new Rectangle(6, 9, "Прямоугольник");
        Triangle triangle = new Triangle(4, 5, 7, "Треугольник");

        ShapeParameterPrinter shape = new ShapeParameterPrinter();
        shape.printArea(circle);
        shape.printPerimeter(circle);
        shape.printAreaPerimeter(circle);

        shape.printArea(rectangle);
        shape.printPerimeter(rectangle);
        shape.printAreaPerimeter(rectangle);

        shape.printArea(triangle);
        shape.printPerimeter(triangle);
        shape.printAreaPerimeter(triangle);
    }
}
