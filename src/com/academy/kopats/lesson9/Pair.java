package com.academy.kopats.lesson9;

public class Pair<T, U> {
    private T value1;
    private U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Первый элемент: " +
                value1 +
                ", второй элемент: " + value2;
    }

    public void first() {
        System.out.println("Первый элемент: " + getValue1());
    }

    public void last() {
        System.out.println("Второй элемент: " + getValue2());
    }

    public Pair<U, T> swap() {
        return new Pair<>(value2, value1);
    }

    public void replaceFirst(T value1) {
        setValue1(value1);
        System.out.println("Первый элемент заменен на: " + getValue1());
    }

    public void replaceLast(U value2) {
        setValue2(value2);
        System.out.println("Второй элемент заменен на: " + getValue2());
    }

    public static <T, U> Pair<U, T> newPair(Pair<T, U> element) {
        return new Pair<>(element.value2, element.value1);
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }
}
