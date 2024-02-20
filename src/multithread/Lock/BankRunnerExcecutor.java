package multithread.Lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankRunnerExcecutor {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> customerArrayList = new ArrayList<>();
        multithread.Lock.BankAccount account = new BankAccount(500);
        System.out.println("Bank is working.....");

        Thread customer1 = new Thread(new Customer("harsha", account));
        Thread customer2 = new Thread(new Customer("arun", account));
        Thread customer3 = new Thread(new Customer("deva", account));

        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);

        ExecutorService customerExecutor = Executors.newFixedThreadPool(3);

        for (Thread customer:customerArrayList) {
            customerExecutor.execute(customer);
        }


        customerExecutor.shutdown();
    }
}
