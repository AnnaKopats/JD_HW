package com.academy.kopats.lesson17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger integer = new AtomicInteger(300);
        BankAccount bankAccount = new BankAccount(integer);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    bankAccount.replenishedBalance(100);
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    bankAccount.debitingFundsBalance(200);
                }
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("Текущий баланс равен: " + bankAccount);
    }

}
