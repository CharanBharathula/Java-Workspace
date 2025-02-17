package BackendCourse.Assignments.EcommerceInventory;

public class Electronics extends Item {
    int warranty;

    public Electronics(String id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
