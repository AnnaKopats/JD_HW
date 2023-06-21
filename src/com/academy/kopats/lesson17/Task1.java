package com.academy.kopats.lesson17;

import com.academy.kopats.lesson16.BankAccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        BankAccount bankAccount = new BankAccount(300.00);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    bankAccount.replenishedBalance(100.00);
                }
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    bankAccount.debitingFundsBalance(200.00);
                }
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("Текущий баланс равен: " + bankAccount);
    }

}
