package com.academy.kopats.lesson16;

import java.util.*;

public class SafeQueue<V> {
    private static final int size = 10;
    private  Queue<V> queue = new ArrayDeque<>(size);

    public SafeQueue() {

    }

    public  synchronized void enqueue(V item) {
        if (queue.size() == 10){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(item);
        System.out.println("Элемент " + item + " добавлен");
        notify();
    }
    public  synchronized V dequeue() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        V q = queue.peek();
        queue.remove(q);
        System.out.println("Элемент " + q + " извлечен");
        return (V) queue;

    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        SafeQueue<String> queue = new SafeQueue<>();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true){
                    queue.dequeue();
                    run();
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true){
                    for (String s : list) {
                        queue.enqueue(s);
                        run();
                    }

                }
            }
        };
        t2.start();

    }


//    private static void stopIt(Object o) {
//        synchronized (o) {
//            try {
//                o.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//    private static void wakeUp(Object o) {
//        synchronized (o) {
//            o.notify();
//        }
//    }


//        for (int i = 0; i < COUNTER; i++) {
//            queue.add(item);
//
//        }



//        for (int i = 0; i < COUNTER; i++) {
//            try {
//                Thread.sleep(1_000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            queue.poll();
//
//        }




//    private static class Enqueue extends Thread {
//        public Enqueue(String name) {
//            super(name);
//            start();
//        }
//
//        @Override
//        public void run() {
//            while (COUNTER > 0) {
//                synchronized (this) {
//                    if (itemCount == size) {
//                        stopIt(treadEnqueue);
//                    }
//                }
//                synchronized (treadDequeue) {
//                    itemCount++;
//                    enqueue(item);
//                    if (itemCount == 1) {
//                        wakeUp(treadDequeue);
//                    }
//                }
//            }
//        }
//    }
//
//    private static class Dequeue extends Thread {
//        public Dequeue(String name) {
//            super(name);
//            start();
//        }
//
//        @Override
//        public void run() {
//            while (COUNTER > 0) {
//                synchronized (this) {
//                    if (itemCount == 0) {
//                        stopIt(treadDequeue);
//                    }
//                }
//                synchronized (treadEnqueue) {
//                    SafeQueue.dequeue();
//                    itemCount--;
//                    COUNTER--;
//                    if (itemCount == size - 1)
//                        wakeUp(treadEnqueue);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Thread t1 = new Enqueue();
//
//
//        while (treadDequeue.getState() != Thread.State.TERMINATED) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
}
