package BackendCourse.Assignments.Threads.Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    Semaphore cS;
    Semaphore pS;
    public Consumer(Store store, Semaphore cS, Semaphore pS) {
        this.store = store;
        this.cS = cS;
        this.pS = pS;
    }

    @Override
    public void run() {
        try {
            cS.acquire();
            System.out.printf("Consumer %s of queue size %d\n", Thread.currentThread().getName(), store.q.size());
            store.q.poll();
            // signal that I consumed one item from the queue
            pS.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
