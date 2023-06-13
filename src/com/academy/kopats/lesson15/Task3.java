package com.academy.kopats.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static Integer value = 0;

    public static void main(String[] args) {
        List<Incrementer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Возникло исключение " + Thread.currentThread().getName() + " " + i);
            }
            Incrementer incrementer = new Incrementer();
            incrementer.start();
            list.add(incrementer);
        }
        for (Incrementer incrementer : list) {
            try {
                incrementer.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(value);
    }
}
