package com.academy.kopats.lesson17;

import com.academy.kopats.lesson16.Buyer;
import com.academy.kopats.lesson16.Cashier;
import com.academy.kopats.lesson16.QueueContainer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Shop {
    public static final int BUYERS_TO_SERVE = 200;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            executorService.execute(new Cashier(i));
        }

        System.out.println("Магазин открылся!");
        for (int i = 0; i < BUYERS_TO_SERVE; i++) {
            Buyer buyer = new Buyer(i);
            QueueContainer.addBuyer(buyer);
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}
