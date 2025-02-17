package BackendCourse.Assignments.Threads.Semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    Semaphore cS;
    Semaphore pS;
    public Producer(Store store, Semaphore cS, Semaphore pS) {
        this.store = store;
        this.cS = cS;
        this.pS = pS;
    }

    @Override
    public void run() {
        try {
            pS.acquire(); // wait until the queue has space
            store.q.add(1); // add one item to the store queue
            System.out.printf("Producer %s of queue size %d\n", Thread.currentThread().getName(), store.q.size());
            // signal that I produced one item to the queue
            cS.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
