package com.academy.kopats.lesson3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[numArray()]; // т.к метод numArray() возвращает 0, то и массив проинициализируется нулевой длины
        for (int number : a) {
            System.out.println(a); // данная строка не выведет на экран массив
        }
    }

    public static int numArray() {
        int[] number = {3, 50, 7, 48, 7, 2, 11, 49};
        for (int i : number) {
            System.out.println(i);
        }
        return 0; //почему 0???
    }
}

