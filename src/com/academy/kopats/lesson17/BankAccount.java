package com.academy.kopats.lesson17;

public class BankAccount{
    private double currentBalance;

    public BankAccount(Double currentBalance) {
        this.currentBalance = currentBalance;
    }


    public synchronized void debitingFundsBalance(double amount) {
        currentBalance -= amount;
        System.out.println("Списано: " + amount + ", текущий баланс: " + currentBalance);
    }


    public synchronized void replenishedBalance(double amount) {
        currentBalance += amount;
        System.out.println("Зачислено: " + amount + ", текущий баланс: " + currentBalance);
    }

    @Override
    public String toString() {
        return String.valueOf(currentBalance);
    }
}
