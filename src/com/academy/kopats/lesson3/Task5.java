package com.academy.kopats.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {20, 4, 2, 12, 7, 25, 500, 9};
        maxValue(array);
        minValue(array);
    }

    public static int[] maxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nМаксимальный элемент равен: " + max);
        return array;
    }

    public static int[] minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("\nМинимальный элемент равен: " + min);
        return array;
    }

}
