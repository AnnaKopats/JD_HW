package com.academy.kopats.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SafeQueue<V> {
    private static final int SIZE = 2;
    private BlockingQueue<V> queue = new ArrayBlockingQueue<>(SIZE);

    public SafeQueue() {

    }

    public void enqueue(V item) {
        try {
            queue.put(item);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Элемент " + item + " добавлен");
    }

    public V dequeue() {
        try {
            System.out.println("Элемент " + queue.take() + " извлечен");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return (V) queue;
    }


    public static void main(String[] args) throws InterruptedException {
        SafeQueue<String> queue = new SafeQueue<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (Integer i : list) {
                    queue.enqueue(String.valueOf(i));
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (Integer i : list) {
                    queue.dequeue();
                }
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}
