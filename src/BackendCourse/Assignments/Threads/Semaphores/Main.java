package BackendCourse.Assignments.Threads.Semaphores;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Semaphore cS = new Semaphore(0);
        Semaphore pS = new Semaphore(5);

        for( int i = 0; i < 5; i++) {
            Thread t = new Thread(new Consumer(store, cS, pS));
            t.start();
        }

        for( int i = 0; i < 5; i++) {
            Thread t = new Thread(new Producer(store, cS, pS));
            t.start();
        }


    }
}
