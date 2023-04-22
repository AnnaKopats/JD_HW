package com.academy.kopats.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];
        int[] vec = new int[3];
        System.out.println("Матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[3];
            vec[i] = (int) Math.round(Math.random() * 10);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вектор: ");

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        if (matrix.length == vec.length) {
            System.out.println("Результат умножения матрицы на вектор: " + Arrays.toString(pow(vec, matrix)));
        } else
            System.out.println("Некорректные данные");
        System.out.println();

    }

    public static int[] pow(int[] a, int[][] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                c[i] = b[i][j] * a[j];
            }
        }
        return c;
    }

}

