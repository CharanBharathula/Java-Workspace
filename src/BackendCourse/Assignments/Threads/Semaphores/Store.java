package BackendCourse.Assignments.Threads.Semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    Queue<Object> q;

    public Store() {

        this.q = new ConcurrentLinkedDeque<>();
    }
}
