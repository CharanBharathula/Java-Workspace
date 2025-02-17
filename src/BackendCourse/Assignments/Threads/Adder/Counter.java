package BackendCourse.Assignments.Threads.Adder;

public class Counter{
    private int count;
    public Counter(int count){
        this.count = count;
    }
    synchronized public void incValue(int offset){
        count += offset;
    }
    synchronized public void decValue(int offset){
        count -= offset;
    }

    public int getVal(){
        return count;
    }
}