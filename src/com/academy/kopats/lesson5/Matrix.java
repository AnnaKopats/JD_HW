package com.academy.kopats.lesson5;

import java.util.Random;

public class Matrix {
    private int[][] matrix;


    public Matrix(int n, int m) {
        this.matrix = new int[n][m];
        Random random = new Random();
        for (n = 0; n < matrix.length; n++) {
            for (m = 0; m < matrix[n].length; m++) {
                this.matrix[n][m] = random.nextInt(-10, 10);
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public  Matrix add(Matrix a) {
        Matrix matrix1 = new Matrix(a.matrix.length, matrix.length);
        if (a.matrix == null || a.matrix.length == 0 || a.matrix[0] == null || a.matrix[0].length == 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Матрица не может быть null");
        }
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Матрица не может быть null");
        }
        if (a.matrix.length != matrix.length || a.matrix[0].length != matrix[0].length) {
            throw new UnsupportedOperationException("Ошибка! Матрицы не равны!");
        } else {
            for (int i = 0; i < matrix1.matrix.length; i++) {
                for (int j = 0; j < matrix1.matrix[i].length; j++) {
                    matrix1.matrix[i][j] = a.matrix[i][j] + matrix[i][j];
                }
            }
        }
        return matrix1;
    }

    public Matrix subtract(Matrix a) {
        Matrix matrix1 = new Matrix(a.matrix.length, matrix.length);
        if (a.matrix == null || a.matrix.length == 0 || a.matrix[0] == null || a.matrix[0].length == 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Матрица не может быть null");
        }
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Матрица не может быть null");
        }
        if (a.matrix.length != matrix.length || a.matrix[0].length != matrix[0].length) {
            throw new UnsupportedOperationException("Ошибка! Матрицы не равны!");
        }else {
            for (int i = 0; i < matrix1.matrix.length; i++) {
                for (int j = 0; j < matrix1.matrix[i].length; j++) {
                    matrix1.matrix[i][j] = a.matrix[i][j] - matrix[i][j];
                }
            }
        }
        return matrix1;
    }
    public Matrix multiply(Matrix a){
        Matrix matrix1 = new Matrix(a.matrix.length, matrix.length);
        if (a.matrix == null || a.matrix.length == 0 || a.matrix[0] == null || a.matrix[0].length == 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Матрица не может быть null");
        }
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Матрица не может быть null");
        }
        if (a.matrix.length != matrix.length || a.matrix[0].length != matrix[0].length) {
            throw new UnsupportedOperationException("Ошибка! Матрицы не равны!");
        }else {
            for (int i = 0; i < matrix1.matrix.length; i++) {
                for (int j = 0; j < matrix1.matrix[i].length; j++) {
                    matrix1.matrix[i][j] = a.matrix[i][j] * matrix[i][j];
                }
            }
        }
        return matrix1;
    }

}
