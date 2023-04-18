package com.academy.kopats.lesson3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
//        maxValue();
//     minValue(array[i]);
//       int[] myArr = Arrays.copyOf(maxValue(ar))
//        System.out.println(Arrays.toString(array)
    }

    public static void maxValue() {
        int[] array = {20, 4, 2, 12, 7, 25, 500, 9};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент равен: " + max);

    }

    public static void minValue() {
        int[] array = {20, 4, 2, 12, 7, 25, 500, 9};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент равен: " + min);
    }
}
