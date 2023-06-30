package com.academy.kopats.lesson17;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class QueueContainer {
    private static final LinkedBlockingQueue<Buyer> queue = new LinkedBlockingQueue<>();
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void addBuyer(Buyer buyer) {
        queue.add(buyer);
    }

    public static Buyer removeBuyer() {
        return queue.poll();
    }

    public static void incrementCounter() {
        counter.incrementAndGet();
    }

    public static boolean isServiceNeeded() {
        return counter.get() <= Shop.BUYERS_TO_SERVE.get();
    }
}
