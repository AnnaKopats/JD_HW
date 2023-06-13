package com.academy.kopats.lesson15;

public class Incrementer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            Task3.value++;
        }
    }
}
