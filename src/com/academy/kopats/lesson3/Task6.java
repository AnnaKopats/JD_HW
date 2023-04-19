package com.academy.kopats.lesson3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[numArray()];
        for (int number : a) {
            System.out.println(a);
        }
    }

    public static int numArray() {
        int[] number = {3, 50, 7, 48, 7, 2, 11, 49};
        for (int i : number) {
            System.out.println(i);
        }
        return 0;
    }
}

