package com.academy.kopats.lesson17;

import com.academy.kopats.lesson16.Buyer;
import com.academy.kopats.lesson16.Shop;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueContainer {
    private static final Queue<Buyer> queue = new ArrayDeque<>(); //нужен потокобезопасный класс очереди
    private static int counter = 0; //и потокобезопасный счетчик

    public static void addBuyer(Buyer buyer) {
            queue.add(buyer);
    }

    public static Buyer removeBuyer() {
            return queue.poll();
    }

    public static void incrementCounter() {
        counter++;
    }

    public static boolean isServiceNeeded() {
        return counter <= Shop.BUYERS_TO_SERVE;
    }
}
