package com.academy.kopats.lesson16;

public class Counter {
    private static final Integer MONITOR = 0;
    private static Integer value = 0;

    private static class IncrementerCounter extends Thread {
        public void increment() {
            for (int i = 0; i < 100; i++) {
                value++;
                System.out.println(this.getName() + " i = " + i);
            }
        }

        @Override
        public void run() {
            synchronized (MONITOR) {
                increment();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            int count = Thread.activeCount();
            for (int i = 0; i < 1000; i++) {
                new IncrementerCounter().start();
            }
            while (Thread.activeCount() > count) {
                Thread.sleep(100);
            }
            System.out.println(value);
        }
    }
}



