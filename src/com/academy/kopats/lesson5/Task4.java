package com.academy.kopats.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(6,9);
        System.out.println("Матрица 1: " + Arrays.deepToString(matrix1.getMatrix()));

        Matrix matrix2 = new Matrix(6,9);
        System.out.println("Матрица 2: " + Arrays.deepToString(matrix1.getMatrix()));

        System.out.println("Результат сложения матриц: " + Arrays.deepToString(matrix1.add(matrix2).getMatrix()));

        System.out.println("Результат умножения матриц: " + Arrays.deepToString(matrix1.multiply(matrix2).getMatrix()));

        System.out.println("Результат вычитания матриц: " + Arrays.deepToString(matrix1.subtract(matrix2).getMatrix()));

    }

}
