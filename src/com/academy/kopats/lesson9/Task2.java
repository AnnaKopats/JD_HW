package com.academy.kopats.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(25,"лет");
        pair.first();
        pair.last();
        System.out.println("Элементы поменяли местами: " + pair.swap());
        pair.replaceFirst(3);
        pair.replaceLast("года");
        System.out.println();
        System.out.println("Элементы поменяли местами: " + pair.swap());
    }
}
