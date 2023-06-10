package com.academy.kopats.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static Integer value = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Incrementer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Incrementer incrementer = new Incrementer();
            incrementer.start();
            list.add(incrementer);

        }

        for (Incrementer incrementer : list) {
            int counter = 0;
            counter++;
            if (counter%10==0){
                incrementer.interrupt();
            }
            try {
                incrementer.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(value);
    }
}
