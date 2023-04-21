package com.academy.kopats.lesson3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        maxValue();
        minValue();
    }

    public static void maxValue() { //в задании: метод ПРИНИМАЕТ массив. а не создает его.
        int[] array = {20, 4, 2, 12, 7, 25, 500, 9};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //для вывода на экран использовать метод из предыдущей задачи
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nМаксимальный элемент равен: " + max);
    }

    public static void minValue() { //в задании: метод ПРИНИМАЕТ массив. а не создает его.
        int[] array = {20, 4, 2, 12, 7, 25, 500, 9};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //для вывода на экран использовать метод из предыдущей задачи
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("\nМинимальный элемент равен: " + min);
    }
}
