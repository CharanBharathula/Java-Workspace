package BackendCourse.Assignments.EcommerceInventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// T extends Item means that T can be any class that extends Item not outside of Item
public class Inventory<T extends Item> {
    private HashMap<String, T> inventory;

    public Inventory(){
        inventory = new HashMap<>();
    }

    public void addItem(T item, RecentlyViewedItems recentlyViewedItems){
        recentlyViewedItems.addRecentlyViewedItem(item);
        inventory.put(item.getName(), item);
    }

    public T getItem(String id){
        return inventory.get(id);
    }

    public void removeItem(T item){
        inventory.remove(item.getId());
    }

    public List<T> getItems(){
        return new ArrayList<>( inventory.values() );
    }
}
