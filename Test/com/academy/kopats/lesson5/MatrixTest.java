package com.academy.kopats.lesson5;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {
    int[][] matrixNew = new int[2][2];
    int[][] matrix1 = new int[][]{{3,5}, {4,2}};
    int[][] matrix2 = new int[][]{{2,4}, {1,3}};

    @Test
    public void addTest() {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrixNew[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        int[][] matrixExpected = {{5,9},{5,5}};
        assertArrayEquals(matrixExpected, matrixNew);
    }

    @Test
    public void subtractTest(){
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrixNew[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        int[][] matrixExpected = {{1,1},{3,-1}};
        assertArrayEquals(matrixExpected, matrixNew);
    }
    @Test
    public void multiplyTest(){
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrixNew[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        int[][] matrixExpected = {{6,20},{4,6}};
        assertArrayEquals(matrixExpected, matrixNew);
    }
    @Test
    public void ZeroTest(){
        Matrix m1 = new Matrix(2,3);
        Matrix m2 = new Matrix(0,3);
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> m1.add(m2));
    }
    @Test
    public void operationTest(){
        Matrix m1 = new Matrix(2,3);
        Matrix m2 = new Matrix(1,3);
        assertThrows(UnsupportedOperationException.class, ()-> m1.add(m2));
    }
}
