package BackendCourse.Assignments.EcommerceInventory;

public class Item implements Comparable<Item> {
    String id;
    String name;
    int price;
    int quantity;

    public Item(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }   @Override
    public int compareTo(Item o) {
        return this.getName().compareTo(o.getName());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
