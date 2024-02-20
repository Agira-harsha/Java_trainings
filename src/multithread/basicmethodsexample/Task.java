package multithread.basicmethodsexample;

public class Task implements Runnable {
        private String threadName;

        public Task(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            System.out.println(threadName + " is running.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " is finished.");
        }
    }

