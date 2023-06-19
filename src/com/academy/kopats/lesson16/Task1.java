package com.academy.kopats.lesson16;

import com.academy.kopats.lesson15.Task3;

import static java.lang.Thread.sleep;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(300.00);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    bankAccount.replenishedBalance(100.00);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    bankAccount.debitingFundsBalance(200.00);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Текущий баланс равен: " + bankAccount);
    }
}
