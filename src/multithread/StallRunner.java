package multithread;

import java.util.ArrayList;
import java.util.List;

public class StallRunner {
    public static void main(String[] args) {


        List<Stall> stallList = new ArrayList<>();
        stallList.add(new Stall("resturent", "Biriyani", 120.0, "Arun"));
        stallList.add(new Stall("statBuckc", "north style", 150.3, "harsha"));
        stallList.add(new Stall("Ice creamshop", "all types", 200.0, "deva"));

        //creating list of threads
        List<Thread> threads = new ArrayList<>();

        for (Stall stall : stallList) {
            Thread t = new Thread(stall);
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();  //it will wait all thread excution has done
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Stall stall : stallList) {
            System.out.println("Total Cost of Stall:" + stall.getStallName() + " : " + stall.getStallCost());
        }
        System.out.println("main Thread Excection Done..");
    }
}