package BackendCourse.Assignments.Threads.Adder;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(0);
        Lock lock = new ReentrantLock();
        Adder a = new Adder(c, lock);
        Substractor s = new Substractor(c, lock);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
