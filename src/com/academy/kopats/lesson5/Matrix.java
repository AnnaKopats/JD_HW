package com.academy.kopats.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix() {

    }

    public Matrix(int i, int j) {
        this.matrix = new int [i][j];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 21 - 10);
            }

        }
      /*  i = matrix.length;
        j = matrix[0].length;
        for (i = 0; i < matrix.length(); ++i) {
            for (int j = 0; j < matrix.getColumnsNum(); ++j) {
                matrix.setElement(i, j, (int) (Math.random() * 10));
            }
        }*/
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public void setElement(int row, int column, int value) {
        checkArgumentsIsLegal(row, column);
        matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        checkArgumentsIsLegal(row, column);
        return matrix[row][column];
    }

    public int getRowsNum() {
        return matrix.length;
    }
    // jkjnk
    public int getColumnsNum() {
        return matrix[0].length;
    }

    private void checkArgumentsIsLegal(int row, int column) {
        if (row < 0 || row >= getRowsNum()) {
            throw new IllegalArgumentException("Illegal row index");
        }

        if (column < 0 || column >= getColumnsNum()) {
            throw new IllegalArgumentException("Illegal column index");
        }
    }

    public Matrix multiply(Matrix multiplier) {
        int thisRows = getRowsNum();
        int thisCols = getColumnsNum();

        int otherRows = multiplier.getRowsNum();
        int otherCols = multiplier.getColumnsNum();
        int value = 0;
        if (thisCols != otherCols) {
            throw new IllegalArgumentException("...here could be your ad...");
        }
        Matrix result = new Matrix(thisRows, otherCols);

        for (int thisRow = 0; thisRow < thisRows; ++thisRow) {
            for (int otherCol = 0; otherCol < otherCols; ++otherCol) {

                for (int thisCol = 0; thisCol < thisCols; ++thisCol) {
                    for (int otherRow = 0; otherRow < otherRows; ++otherRow) {
                        value = matrix[thisRow][thisCol] * multiplier.getElement(otherRow, otherCol);
                    }
                }
                if ((value >>> 32) > 0) {
                    System.out.println("Integer overflow while multiplying matrixes.");
                }
                result.setElement(thisRow, otherCol, value);
            }
        }
        return result;
    }
}
