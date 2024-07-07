package multithreading.LockProgram;
import java.util.concurrent.locks.ReentrantLock;
class SharedResource {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }
}

class Worker extends Thread {
    private final SharedResource sharedResource;

    public Worker(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LockExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread worker1 = new Worker(sharedResource);
        Thread worker2 = new Worker(sharedResource);

        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + sharedResource.getCounter());
    }
}
