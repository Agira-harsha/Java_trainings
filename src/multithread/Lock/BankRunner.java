package multithread.Lock;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        System.out.println("Bank is working.....");

        Thread customer1 = new Thread(new Customer("harsha", account));
        Thread customer2 = new Thread(new Customer("arun", account));
        Thread customer3 = new Thread(new Customer("deva", account));

        customer1.start();
        customer2.start();
        customer3.start();

        try{
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Bank is  Closed....Come Tommorrow...??");
    }
}