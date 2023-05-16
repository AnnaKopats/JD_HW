package com.academy.kopats.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(25,48);
        pair.first();
        pair.last();
        pair.swap();
        pair.replaceFirst(3);
        pair.replaceLast(5);
    }
}
