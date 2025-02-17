package BackendCourse.Assignments.Threads.Adder;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable{
    Counter c;
    Lock lock;
    Substractor(Counter c, Lock lock){
        this.c = c;
        this.lock = lock;
    }

	@Override
	public void run() {
        // locks are required if we need limit methods to be accessible by one thread at a time
        // or we can use synchronized keyword in the method signature
        // either create locks objects and pass to threads so that they can call lock() or unlcock() methods

        
        //lock.lock();
        for (int i = 0; i < 100000; i++) {
            //c.i -= i;
            c.decValue(1);
        }
        //lock.unlock();
	}
}