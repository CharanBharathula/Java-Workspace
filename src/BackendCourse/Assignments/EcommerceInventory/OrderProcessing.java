package BackendCourse.Assignments.EcommerceInventory;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderProcessing{
    PriorityQueue<Order> pq;
    OrderProcessing(){
        pq = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        pq.add(order);
    }

    public Order processOrder(){
        return pq.poll();
    }

    public int size(){
        return pq.size();
    }

    public void setComparator(Comparator<Order> comparator){
        pq = new PriorityQueue<>(comparator);
    }
}
