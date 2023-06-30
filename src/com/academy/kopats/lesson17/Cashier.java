package com.academy.kopats.lesson17;

import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Cashier extends Thread {
    private static final ReentrantLock reentrantLock = new ReentrantLock();

    public Cashier(int i) {
        super("Cashier N" + i);
    }

    @Override
    public void run() {
        while (QueueContainer.isServiceNeeded()) {
            Buyer buyer = QueueContainer.removeBuyer();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            printBill(buyer);
            QueueContainer.incrementCounter();
        }
        System.out.println(this.getName() + " завершил работу");
    }
    private void printBill(Buyer buyer) {
        if (buyer == null) {
            return;
        }
        reentrantLock.lock();
        Map<String, Integer> bucket = buyer.getBucket();
        System.out.println("--------------------------------------");
        System.out.println(this.getName() + " обслуживает " + buyer.getName());
        double sum = 0;
        for (Map.Entry<String, Integer> entry : bucket.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            sum += entry.getValue();
        }
        System.out.println("Итого сумма: " + sum);
        System.out.println("--------------------------------------");
        reentrantLock.unlock();
    }
}
