package com.academy.kopats.lesson14;

import java.io.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/kopats/lesson14/";
        String filName = "input.txt";
        String fullPath = path + filName;
        String newFile = "occurrences.txt";
        String fullPathNew = path + newFile;
        int sum = 0;
        try (RandomAccessFile file = new RandomAccessFile(fullPath, "rw")) {

            int c;
            while ((c = file.read()) != -1) {
                if (c == 'a') {
                    sum = sum + 1;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPathNew)))) {

            dos.write((sum + " ").getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
