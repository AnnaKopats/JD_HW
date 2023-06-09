package com.academy.kopats.lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/kopats/lesson14/";
        String filIn1 = "in1.txt";
        String filIn2 = "in2.txt";
        String fullPathIn1 = path + filIn1;
        String fullPathIn2 = path + filIn2;
        String out = "out.txt";
        String fullPathOut = path + out;

        int[] num = new int[1000];
        Random random = new Random();

        try (DataOutputStream dos1 = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fullPathIn1)))) {
            for (int i = 0; i < num.length; i++) {
                num[i] = random.nextInt(100000);
                dos1.write((num[i] + " ").getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (DataOutputStream dos2 = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fullPathIn2)))) {
            for (int i = 0; i < num.length; i++) {
                num[i] = random.nextInt(100000);
                dos2.write((num[i] + " ").getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Integer> arr = new ArrayList<>();

        try (DataOutputStream dos = new DataOutputStream
                (new BufferedOutputStream
                        (new FileOutputStream(fullPathOut)))) {
            try (SequenceInputStream sis = new SequenceInputStream
                    (new FileInputStream(fullPathIn1), new FileInputStream(fullPathIn2))) {
                int i = 0;
                while ((i = sis.read()) != -1) {
                    arr.add(i);
                }
                Collections.sort(arr);
                dos.write(arr.toString().getBytes()); //файл out.txt не хранит числа из in1 и in2. тебе нужно считать эти файлы через dataInputStream по очереди.
                System.out.println(arr);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
