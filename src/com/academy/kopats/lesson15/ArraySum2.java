package com.academy.kopats.lesson15;

public class ArraySum2 implements Runnable {
    private int[] array = new int[]{};

    public ArraySum2() {
    }

    public ArraySum2(int[] array) {
        this.array = array;
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = array.length / 2; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public void run() {
        System.out.println(sum(array));
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


}


