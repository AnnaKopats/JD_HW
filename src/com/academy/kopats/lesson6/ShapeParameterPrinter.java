package com.academy.kopats.lesson6;

public class ShapeParameterPrinter {
    public void printArea(Shape shape) {
        System.out.println("Площадь фигуры: " + shape.getName() + " = " + shape.getArea());
    }
    public void printPerimeter(Shape shape) {
        System.out.println("Периметр фигуры: " + shape.getName() + " = " + shape.getPerimeter());
    }
    public void printAreaPerimeter(Shape shape) {
        System.out.println("Площадь и периметр фигуры: " + shape.getName() + " = " + shape.getArea() + " и " + shape.getPerimeter());
    }

}
