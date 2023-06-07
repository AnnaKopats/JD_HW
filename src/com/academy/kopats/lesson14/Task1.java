package com.academy.kopats.lesson14;

import java.io.*;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/kopats/lesson14/";
        String filName = "matrix.txt";
        String fullPath = path + filName;

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fullPath))) {
            int[][] matrix = new int[6][4];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * (30 + 1)) - 15;
                    printWriter.printf("%3d" + " ", matrix[i][j]);
                }
                printWriter.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileReader fileReader = new FileReader(fullPath)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
