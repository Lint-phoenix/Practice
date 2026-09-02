class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo implements Runnable {
    private Counter counter;

    ThreadDemo(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(new ThreadDemo(counter));
        Thread t2 = new Thread(new ThreadDemo(counter));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
