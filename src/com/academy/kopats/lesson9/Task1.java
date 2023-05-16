package com.academy.kopats.lesson9;

public class  Task1 {
    public static void main(String[] args) {
        TapeArray<Integer> intArr = new TapeArray<>(new Integer[]{5, 66, 20, 7, 30});
        System.out.println(intArr.getArrayIndex(-22));
    }
}
