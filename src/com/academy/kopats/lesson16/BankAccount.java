package com.academy.kopats.lesson16;

public class BankAccount {
    public static Double currentBalance = 300.00;
    public static final Double REPLENISHED = 100.00;
    public static final Double DEBITING_FUNDS = 200.00;
    public static Integer count = 100;
    public static Integer count2 = 0;
    public static Integer count3 = 0;
    private static final BankAccountDebitingFundsBalance BADFB = new BankAccountDebitingFundsBalance();
    private static final BankAccountReplenishedBalance BARB = new BankAccountReplenishedBalance();


    private static void stopIt(Object o) {
        synchronized (o) {
            try {
                o.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void wakeUp(Object o) {
        synchronized (o) {
            o.notify();
        }
    }


    public static class BankAccountDebitingFundsBalance extends Thread {

        public synchronized void debitingFundsBalance() {
            currentBalance -= DEBITING_FUNDS;
        }

        @Override
        public void run() {
            synchronized (BARB) {
                while (count > 0) {
                    synchronized (this) {
                        if (count2 ==0) {
                            stopIt(BADFB);
                        }else {
                            debitingFundsBalance();
                            count2++;
                            System.out.println(getName() + " Списано: " + DEBITING_FUNDS + "Текущий баланс: " + currentBalance);
                        }
                    }
                    synchronized (BARB) {
                        if (count2 == 1) {
                            wakeUp(BARB);
                        }
                    }
                }
            }
        }
    }

    public static class BankAccountReplenishedBalance extends Thread {

        public synchronized void replenishedBalance() {
            currentBalance += DEBITING_FUNDS;
            currentBalance += DEBITING_FUNDS;
        }

        @Override
        public void run() {
            synchronized (BADFB) {
                while (count > 0) {
                    synchronized (this) {
                        if (count3 == 0)
                            stopIt(BARB);
                    }
                    synchronized (BADFB) {
                        replenishedBalance();
                        count3++;
                        System.out.println(getName() + " Поступило: " + REPLENISHED + "Текущий баланс: " + currentBalance);
                        if (count3 == 1) {
                            wakeUp(BADFB);
                        }
                    }
                }
            }
        }
    }
}


