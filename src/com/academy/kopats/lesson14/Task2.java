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
                dos1.writeInt(random.nextInt(100000));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (DataOutputStream dos2 = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fullPathIn2)))) {
            for (int i = 0; i < num.length; i++) {
                dos2.writeInt(random.nextInt(100000));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        try (DataInputStream dis1 = new DataInputStream(new BufferedInputStream(new FileInputStream(fullPathIn1)))) {
                while (dis1.available()>0) {
                    arr.add(dis1.readInt());
                }
                DataInputStream dis2 = new DataInputStream(new BufferedInputStream(new FileInputStream(fullPathIn2)));
                while (dis2.available()>0) {
                    arr.add(dis2.readInt());
                }
            Collections.sort(arr);
           // System.out.print(arr);

            DataOutputStream dos = new DataOutputStream
                    (new BufferedOutputStream
                            (new FileOutputStream(fullPathOut)));
            for (Integer integer : arr) {
                dos.write((integer + " ").getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
