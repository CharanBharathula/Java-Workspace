# Ecommerce Inventory Management

A step-by-step guide to building a basic e-commerce inventory management system from scratch using Java.

## Introduction

This project helps you learn how to design and implement a simple inventory management system. It uses object-oriented programming concepts to manage various product types in an inventory.

---

## Milestone 1: Setting Up the Project

1. **Create a New Java Project**:
    - Open your preferred IDE (e.g., IntelliJ IDEA or Eclipse).
    - Create an empty Java project with a descriptive name, such as `EcommerceInventory`.

2. **Design the Base Item Class**:
    - Create a class called `Item.java`.
    - Define attributes common to all products, such as `id`, `name`, `price`, and `quantity`.
    - Add appropriate getter and setter methods to encapsulate these fields.

3. **Create Specific Product Classes**:
    - Design separate classes for each product type, such as `Electronics`, `Books`, and `Clothing`.
    - Each class should extend the `Item` class to inherit common attributes.
    - Add unique attributes to each class (e.g., `Books` may have `author` , while `Electronics` have `warranty` and Clothing have `size`).

---

## Milestone 2: 

1. **Create the `Inventory` Class**:
    - This class will manage all the items in the inventory.
    - Define a `HashMap<String, T>` to store items, where the key is the `item ID` and the value is the `Item` object.

2. **Add Methods to `Inventory`**:
    - Implement the `addItem` method to add items to the inventory.
    - Implement the `getItem` method to retrieve items by their ID.
    - Optionally, add methods like `removeItem` to delete items.
    - Indirectly just adding, removing and getting from or to `hashmap`
3. **Recently Viewed Items**:
   - Add a class, `RecentlyViewedItems`, to track the last few items accessed in the inventory.
   - Use a data structure like a `LinkedList` of type `Item` to maintain the list of recently viewed items.
   - When an item was added to inventory, pass the object of RecentlyViewedItems to the Inventory class and add the item to the list.
   - Write a method `addRecentlyViewedItem()` add the item to first in the list and check if the list size is greater than 5, remove the last item from the list.
   - Write another method called `displayRecentlyViewedItems()` to display the items in the list.

4. **Test the Classes**:
    - Create a class called `InventoryManagement` to test the inventory management system.
    - Write a `main` method in a separate class, such as `InventoryManagement.java`.
    - Create sample objects for each product type (e.g., a book, an electronic item).
    - Create object of `Inventory` class for each type of product.
    - Add these objects to the inventory using the `addItem` method.
    - Retrieve and display these objects to ensure your methods are working correctly.

---

## Milestone 3: Order Management and Processing

1. **Order Management**:
    - Create an `Order` class to represent customer orders which implements Comparable<Order> which lets to add a custom order.
    - Define attributes like `orderId`, and `totalAmount` and `isExpressDelivery`.
    - add setters, getters constructors.
    - Write a method `compareTo()` where we need to compare two orders order1 and order2
    - if order1 is express delivery and order2 is not, then order1 should come first
    - if both are express delivery, then decide basis on order id
   
2. **Order Processing**:
    - Add an `OrderProcessing` class to manage orders and calculate total amounts.
    - Add a `PriorityQueue` of type `Order` to store orders based on their priority.
    - Write a method `addOrder()` to add orders to the queue.
    - Write a method `processOrder()` to process the orders in the queue based on their priority (remove orders from queue).
    - Write a method `setComparator()` which will create a new queue and takes `new Comparator<Order>()` as argument which will be passed from InventoryManagement class. 
    - Create another class `OrderTotalAmountComparator` which implements `Comparator<Order>` and override `compare()` method to compare the total amount of two orders.
   
3. **Comparator for Sorting**:
    - Implement a comparator, such as `OrderTotalAmountComparator`, to sort orders based on their total amount.
   
4. **Testing Order Processing**:
    - Create objects for `Order` class with data and create OrderProcessing object.
    - Add sample orders to the `PriorityQueue` and test the `processOrder` method to ensure orders are processed correctly.
---

## Milestone 4: Enhancing the Application

1. **Search and Filter Functionality**:
    - Add methods to search for items based on criteria like name or category.
    - Implement filtering to display items based on attributes (e.g., price range or availability).

2. **Error Handling and Validation**:
    - Ensure all inputs are validated before processing.
    - Add meaningful error messages for invalid actions, such as attempting to access a non-existent item.

3. **Extensibility**:
    - Make the codebase flexible for adding more product types in the future.
    - Use interfaces or abstract classes to generalize the implementation.

---

## Conclusion

By following the above milestones, you can build a fully functional e-commerce inventory management system. This project demonstrates core OOP principles, such as inheritance, encapsulation, and polymorphism, while providing a practical use case for managing data in real-world applications.

Feel free to enhance the project by integrating a graphical user interface or connecting it to a database for persistent storage.
