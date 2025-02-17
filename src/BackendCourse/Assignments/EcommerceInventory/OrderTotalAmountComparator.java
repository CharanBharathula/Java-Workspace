package BackendCourse.Assignments.EcommerceInventory;

import java.util.Comparator;

public class OrderTotalAmountComparator implements Comparator<Order>{

    // order which have the highest amount should come first
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getTotalAmount() - o2.getTotalAmount();
    }
}
