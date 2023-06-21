package com.academy.kopats.lesson17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private final static AtomicInteger value = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new IncrementerCounter("Incrementer 1"));
        executorService.execute(new IncrementerCounter("Incrementer 2"));
        executorService.execute(new IncrementerCounter("Incrementer 3"));

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("Итоговое значение: " + value.get());
    }

    static class IncrementerCounter implements Runnable {
        private String name;

        public IncrementerCounter(String name) {
            this.name = name;
        }

        public void increment() {
            for (int i = 0; i < 100; i++) {
                value.incrementAndGet();
                System.out.println(name + " i = " + i);
            }
        }

        @Override
        public void run() {
            increment();
        }
    }
}
