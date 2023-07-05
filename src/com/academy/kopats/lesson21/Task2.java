package com.academy.kopats.lesson21;

public class Task2 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println(shapeFactory.getShape().getArea());
    }
}
