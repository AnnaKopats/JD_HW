package com.academy.kopats.lesson17;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private AtomicInteger currentBalance;
    public BankAccount(AtomicInteger currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void debitingFundsBalance(int amount) {
        for (int i = 0; i < 200; i++) {
            currentBalance.decrementAndGet();
        }
        System.out.println("Списано: " + amount + ", текущий баланс: " + currentBalance);
    }

    public void replenishedBalance(int amount) {
        currentBalance.addAndGet(amount);
        System.out.println("Зачислено: " + amount + ", текущий баланс: " + currentBalance);
    }

    @Override
    public String toString() {
        return String.valueOf(currentBalance);
    }
}
