package multithread.Lock;

import java.util.Random;

class Customer implements Runnable {
    private String name;
    private BankAccount account;
    private Random random;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
        this.random = new Random();
    }



    @Override
    public   void run() {
        for (int i = 0; i < 3; i++) {
            int withdrawalAmount = random.nextInt(100) + 1; // Random withdrawal amount between $1 and $100
            try {
                account.withdraw(withdrawalAmount, name);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
