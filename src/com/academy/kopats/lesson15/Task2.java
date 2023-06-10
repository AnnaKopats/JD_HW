package com.academy.kopats.lesson15;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arraySum = new int[]{2, 5, 4, 9, 10};

        Runnable runnable1 = new ArraySum1(arraySum);
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = new ArraySum2(arraySum);
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        System.out.println(Arrays.stream(arraySum).sum());

    }
}
