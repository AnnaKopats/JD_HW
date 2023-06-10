package com.academy.kopats.lesson15;

public class ArraySum1 implements Runnable{
    private int[] array = new int[]{};

    public ArraySum1() {
    }

    public ArraySum1(int[] array) {
        this.array = array;
    }

    public int sum(int[] array){
        int sum=0;
        for (int i = 0; i < array.length/2; i++) {
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
