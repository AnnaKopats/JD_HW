package com.academy.kopats.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел");
        int[] array = new int[6];
        numberArr(Arrays.toString(array));               //вызов Task 4.1
        System.out.println();
        int[] array2 = {3, 49, 5, 99, 7, 500, 1, 0, 8};
        numArray(array2);                                  //вызов Task 4.2
        System.out.println();
        numArray2(array2);                                     //вызов Task 4.3
        System.out.println();
        System.out.println(Arrays.toString(numArray(array2))); //вызов Task 6
    }

    //   Task 4.1
    public static String numberArr(String a) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        String trim = a.trim();
        String[] split = a.split(" ");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.valueOf(split[i]);
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        return a;
    }

    //Task 4.2
    public static int[] numArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    //Task 4.3
    public static int[] numArray2(int[] arr) {
        for (int i : arr) {
            if (i % 7 == 0)
                continue;
            System.out.print(i + " ");
        }
        return arr;
    }
}



