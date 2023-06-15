package com.academy.kopats.lesson16;

import com.academy.kopats.lesson15.Task3;

import static java.lang.Thread.sleep;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        new BankAccount.BankAccountDebitingFundsBalance().start();

        new BankAccount.BankAccountReplenishedBalance().start();

        Thread.sleep(1000);
        System.out.println(BankAccount.currentBalance);

    }
}
