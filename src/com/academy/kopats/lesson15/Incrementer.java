package com.academy.kopats.lesson15;

public class Incrementer extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            Task3.value++;

            while (!Thread.currentThread().isInterrupted()) { //прочитай внимательно. ты выбрасываешь исключение во всех не прерваных потоках. наоборот прервать нужно каждый 10-ый

                throw new RuntimeException("Возникло исключение" + Thread.currentThread().getName());

            }

        }
    }
}
