package BackendCourse.Assignments.EcommerceInventory;

public class Clothing extends Item{
    String size;

    public Clothing(String id, String name, int price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
