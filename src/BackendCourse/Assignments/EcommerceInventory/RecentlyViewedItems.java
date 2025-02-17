package BackendCourse.Assignments.EcommerceInventory;

import java.util.LinkedList;

public class RecentlyViewedItems {
    LinkedList<Item> recentlyViewedItems;
    private static final int MAX_RECENTLY_VIEWED_ITEMS = 5;

    public RecentlyViewedItems() {
        this.recentlyViewedItems = new LinkedList<Item>();
    }

    public void addRecentlyViewedItem(Item item){
        recentlyViewedItems.addFirst(item);

        if( recentlyViewedItems.size() > MAX_RECENTLY_VIEWED_ITEMS )
            recentlyViewedItems.removeLast();
    }

    public void displayRecentlyViewedItems(){
        System.out.println("Recently Viewed Items: ");
        for (Item item : recentlyViewedItems) {
            System.out.println(item.getName());
        }
    }
}
