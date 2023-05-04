package com.academy.kopats.lesson6;

public class ShapeParameterPrinter {
    public void circleArea(Circle circle) {
        System.out.println("Площадь круга равна: " + circle.getArea());
    }

    public void circlePerimeter(Circle circle) {
        System.out.println("Периметр круга равен: " + circle.getPerimeter());
    }

    public void circlePerimeterArea(Circle circle) { // это что за ужас? :)))) а если число фигур будет расти, так и будем копипастить методы??? Интерфейс Shape должен решить эту проблему! должно быть всего лишь 3 метода в этом классе!
        System.out.println("Периметр круга равен: " + circle.getPerimeter() + " Площадь круга равна: " + circle.getArea());
    }

    public void rectangleArea(Rectangle rectangle) {
        System.out.println("Площадь прямоугольника равна: " + rectangle.getArea());
    }

    public void rectanglePerimeter(Rectangle rectangle) {
        System.out.println("Периметр прямоугольника равен: " + rectangle.getPerimeter());
    }

    public void rectanglePerimeterArea(Rectangle rectangle) {
        System.out.println("Периметр прямоугольника равен: " + rectangle.getPerimeter() + " Площадь прямоугольника равна: " + rectangle.getArea());
    }

    public void triangleArea(Triangle triangle) {
        System.out.println("Площадь треугольника равна: " + triangle.getArea());
    }

    public void trianglePerimeter(Triangle triangle) {
        System.out.println("Периметр треугольника равен: " + triangle.getPerimeter());
    }

    public void trianglePerimeterArea(Triangle triangle) {
        System.out.println("Периметр треугольника равен: " + triangle.getPerimeter() + " Площадь треугольника равна: " + triangle.getArea());
    }
}
