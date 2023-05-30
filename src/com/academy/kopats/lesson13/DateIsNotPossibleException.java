package com.academy.kopats.lesson13;

public class DateIsNotPossibleException extends Exception {
    public DateIsNotPossibleException() {
        System.out.println("Введите другую дату");;
    }
}
