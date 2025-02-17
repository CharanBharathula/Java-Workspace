package BackendCourse.Assignments.EcommerceInventory;


public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpressDelivery;
    private int totalAmount;

    public Order(String orderId, boolean isExpressDelivery, int totalAmount) {
        this.orderId = orderId;
        this.isExpressDelivery = isExpressDelivery;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpressDelivery() {
        return isExpressDelivery;
    }

    public void setExpressDelivery(boolean expressDelivery) {
        isExpressDelivery = expressDelivery;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    //we need to compare two orders order1 and order2
    //if order1 is express delivery and order2 is not, then order1 should come first
    //if both are express delivery, then decide basis on order id

    @Override
    public int compareTo(Order o) {
        if( this.isExpressDelivery() && o.isExpressDelivery() ) {
            return this.orderId.compareTo(o.orderId);
        } else if( this.isExpressDelivery() ) {
            return -1;
        } else {
            return 1;
        }

    }
}
