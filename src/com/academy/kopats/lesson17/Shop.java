package com.academy.kopats.lesson17;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Shop {
    public static final AtomicInteger BUYERS_TO_SERVE = new AtomicInteger(200);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            executorService.execute(new Cashier(i));
        }

        System.out.println("Магазин открылся!");
        for (int i = 0; i < BUYERS_TO_SERVE.get(); i++) {

            Buyer buyer = new Buyer(i);
            QueueContainer.addBuyer(buyer);

        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}
