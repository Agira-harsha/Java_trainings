package multithread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance;
    private Lock lock;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void withdraw(int amount, String customerName) {
        boolean lockAcquired = false;
        try {
            lockAcquired = lock.tryLock();
            if (lockAcquired) {
                System.out.println(customerName + " is withdrawing $" + amount);
                try {
                    System.out.println("Please Wait some Time...");
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("New balance after withdrawal by " + customerName + ": $" + balance);
                } else {
                    System.out.println(customerName + " tried to withdraw $" + amount + ", but insufficient funds.");
                }
            } else {
                System.out.println(customerName + " is waiting to withdraw. Another customer is already withdrawing.");
            }
        } finally {
            if (lockAcquired) {
                lock.unlock();
            }
        }
    }
}