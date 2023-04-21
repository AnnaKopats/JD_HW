package com.academy.kopats.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        number();
        numArray();
        numArray2();

    }

    public static void number() {
        System.out.println("Введите 7 элементов через пробел"); //Почему именно 7 элементов? Я хочу вводить сколько мне нужно
        int[] array = new int[7];
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String trim = string.trim();
        String[] split = string.split(" "); // этот метод нужно вызвать у строки, которую вернет метод trim.
        int i; // если i используется только в теле цикла, зачем объявлять ее снаружи?
        for (i = 0; i < split.length; i++) {
            array[i] = Integer.valueOf(split[i]);
        }
        for (int number : array) { //в задании: метод ВОЗВРАЩАЕТ массив. На экран выводит другой метод
            System.out.println(number);
        }
    }

    //Task 4.2
    public static void numArray() { //в задании: метод ПРИНИМАЕТ массив. а не создает его.
        int[] number = {3, 50, 7, 48, 7, 2, 11, 49};
        for (int i : number) {
            System.out.println(i);
        }
    }

    //Task 4.3
    public static void numArray2() { //в задании: метод ПРИНИМАЕТ массив. а не создает его.
        int[] number = {3, 50, 7, 0, 7, 2, 11, 49};
        for (int i : number) {
            if (i % 7 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}



