package multithread.ProducerConsumer;

import java.util.LinkedList;

class Bakery implements Runnable {
    private LinkedList<Integer> breadBasket = new LinkedList<>();

    public Bakery() {
        for (int i = 1; i <= 3; i++) {
            breadBasket.add(i);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                produce();
                Thread.sleep(1000); // Simulating time between production cycles
                consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void produce() throws InterruptedException {
        int bread = breadBasket.isEmpty() ? 1 : breadBasket.getLast() + 1;
        int maxCapacity = 5;
        while (breadBasket.size() == maxCapacity) {
            System.out.println("Bread basket is full. Waiting for consumers...");
            wait();
        }
        System.out.println("Baker produced bread: " + bread);
        breadBasket.add(bread);
        Thread.sleep(1000);
        notify();
    }

    private synchronized void consume() throws InterruptedException {
        while (breadBasket.isEmpty()) {
            System.out.println("No bread available. Waiting for bakers to produce...");
            wait();
        }
        int consumedBread = breadBasket.removeFirst();
        System.out.println("Customer consumed bread: " + consumedBread);
        Thread.sleep(2000);
        notify(); // Notify baker that bread is consumed
    }
}