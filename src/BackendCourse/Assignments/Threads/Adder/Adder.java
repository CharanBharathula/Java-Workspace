package BackendCourse.Assignments.Threads.Adder;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter c;
    Lock lock;
    public Adder(Counter c, Lock lock) {
        this.c = c;
        this.lock = lock;
    }
    
    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 100000; i++) {
            //c.i += 1;
            c.incValue(1);
        }
        lock.unlock();
    }
}