package com.academy.kopats.lesson6;

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(6, 9);
        Triangle triangle = new Triangle(4, 5, 7);

        ShapeParameterPrinter shapeParameterPrinter = new ShapeParameterPrinter();

        shapeParameterPrinter.circleArea(circle);
        shapeParameterPrinter.circlePerimeter(circle);
        shapeParameterPrinter.circlePerimeterArea(circle);

        shapeParameterPrinter.rectangleArea(rectangle);
        shapeParameterPrinter.rectanglePerimeter(rectangle);
        shapeParameterPrinter.rectanglePerimeterArea(rectangle);

        shapeParameterPrinter.triangleArea(triangle);
        shapeParameterPrinter.trianglePerimeter(triangle);
        shapeParameterPrinter.trianglePerimeterArea(triangle);
    }
}
