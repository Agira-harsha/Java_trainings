package multithread.basicmethodsexample;

public class MultithreadingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new FactorialCalculator("Thread 1", 5));
        Thread thread2 = new Thread(new FactorialCalculator("Thread 2", 7));

        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
