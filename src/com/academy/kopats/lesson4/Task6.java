package com.academy.kopats.lesson4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {3, 0, 9, 22, 74, 11, 36, 2};
        System.out.println("Изначальный массив:" + Arrays.toString(array));
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int average = low + (high - low) / 2;
        int support = array[average];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < support) {
                i++;
            }
            while (array[j] > support) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}
