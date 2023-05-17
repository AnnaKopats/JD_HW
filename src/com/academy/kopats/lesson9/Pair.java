package com.academy.kopats.lesson9;

public class Pair<T> { //значения должны быть параметризованы разными типами. Pair<U, V>
    private T value1, value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public void first(){
        System.out.println("Первый элемент: " + getValue1());
    }
    public void last(){
        System.out.println("Второй элемент: " + getValue2());
    }
    public void swap(){
        T value3 = value1;
        value1 = value2;
        value2 = value3;
        System.out.println("Первый элемент: " + value1 + ". Второй элемент: " + value2);
    }
    public void replaceFirst(T value1){
        setValue1(value1);
        System.out.println("Первый элемент заменен на: " + getValue1());
    }
    public void replaceLast(T value2){
        setValue2(value2);
        System.out.println("Второй элемент заменен на: " + getValue2());
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}
