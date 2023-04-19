package com.academy.kopats.lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 6, 8},
                {9, 18, 7},
                {4, 22, 22}
        };
        int maxSum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int countSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                countSum += matrix[i][j];
            }
            if (countSum > maxSum) {
                maxSum = countSum;
                index = i;
            }
        }
        System.out.print("Индекс строки с максимальной суммой элементов: " + index);
    }
}
