package multithread.ProducerConsumer;

public class BakeryRunner {
    public static void main(String[] args) {

        Thread bakeryThread1 = new Thread(new Bakery());

        bakeryThread1.start();
    }
}