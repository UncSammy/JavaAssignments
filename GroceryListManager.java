
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();

    private HashMap<String, Double> itemCosts = new HashMap<>();
    private HashMap<String, String> itemCategories = new HashMap<>();
    private HashMap<String, Integer> itemQuantities = new HashMap<>();

    // Task 1: Add an item
    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        }
    }

    // Task 2: Add an item with cost
    public void addItem(String item, double cost) {
        if (cost >= 0) {
            addItem(item);
            itemCosts.put(item, cost);
        }
    }

    // Task 3: Add an item with cost and category
    public void addItem(String item, double cost, String category) {
        addItem(item, cost);
        itemCategories.put(item, category);
    }

    // Task 4: Add an item with cost, category and quantity
    public void addItem(String item, double cost, String category, int quantity) {
        if (cost >= 0 && quantity >= 0) {
            addItem(item, cost, category);
            itemQuantities.put(item, quantity);
        }
    }

    // Remove an item
    public void removeItem(String item) {
        groceryList.remove(item);
        itemCosts.remove(item);
        itemCategories.remove(item);
        itemQuantities.remove(item);
    }

    // Display all items
    public void displayList() {
        System.out.println("Grocery List:");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Check if an item exists
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Calculate total cost including quantity
    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList) {
            if (itemCosts.containsKey(item)
                    && itemQuantities.containsKey(item)) {

                total += itemCosts.get(item) * itemQuantities.get(item);
            }
        }

        return total;
    }

    // Task 3: Display items by category
    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);

        for (String item : groceryList) {
            if (itemCategories.containsKey(item)
                    && itemCategories.get(item).equalsIgnoreCase(category)) {

                System.out.println(item);
            }
        }
    }

    // Task 4: Update quantity
    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantities.containsKey(item) && newQuantity >= 0) {
            itemQuantities.put(item, newQuantity);
        } else {
            System.out.println("Item not found or invalid quantity.");
        }
    }

    // Task 4: Display available items
    public void displayAvailableItems() {
        System.out.println("Available Grocery Items:");

        for (String item : groceryList) {
            if (itemQuantities.containsKey(item)
                    && itemQuantities.get(item) > 0) {

                System.out.println(item + " - "
                        + itemQuantities.get(item) + " pcs");
            }
        }
    }

    // Main method: Test all tasks
    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        // Task 1: Grocery List
        System.out.println("--- Task 1: Grocery List ---");

        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        manager.displayList();

        System.out.println();
        System.out.println("Is \"Milk\" in the grocery list? "
                + manager.checkItem("Milk"));

        System.out.println();
        System.out.println("Removing \"Milk\" from the list...");
        manager.removeItem("Milk");

        System.out.println();
        System.out.println("Updated Grocery List:");
        manager.displayList();

        // Task 2: Total Cost
        System.out.println();
        System.out.println("--- Task 2: Total Cost ---");

        manager.addItem("Apples", 2.50);
        manager.addItem("Milk", 1.80);
        manager.addItem("Bread", 2.20);

        // Task 3: Categories
        System.out.println();
        System.out.println("--- Task 3: Categories ---");

        manager.addItem("Banana", 1.50, "Fruits");
        manager.addItem("Cheese", 3.00, "Dairy");
        manager.addItem("Cake", 4.50, "Bakery");

        manager.displayByCategory("Fruits");
        manager.displayByCategory("Dairy");
        manager.displayByCategory("Bakery");

        // Task 4: Quantity Tracking
        System.out.println();
        System.out.println("--- Task 4: Quantity Tracking ---");

        manager.addItem("Oranges", 2.00, "Fruits", 5);
        manager.addItem("Yogurt", 1.50, "Dairy", 3);
        manager.addItem("Cookies", 3.00, "Bakery", 0);

        manager.displayAvailableItems();

        System.out.println();
        System.out.println("Updating Yogurt quantity to 5...");
        manager.updateQuantity("Yogurt", 5);

        manager.displayAvailableItems();

        // Task 5: Grocery List Tester
        System.out.println();
        System.out.println("--- Task 5: Grocery List Tester ---");

        // Test total cost
        System.out.println();
        System.out.println("Testing total cost:");

        System.out.printf("Total cost: %.2f euros%n",
                manager.calculateTotalCost());

        // Test categories
        System.out.println();
        System.out.println("Testing categories:");

        manager.displayByCategory("Fruits");

        // Test quantity updates
        System.out.println();
        System.out.println("Testing quantity tracking:");

        manager.updateQuantity("Oranges", 10);
        manager.displayAvailableItems();

        // Test removing an item
        System.out.println();
        System.out.println("Testing item removal:");

        manager.removeItem("Cookies");
        manager.displayAvailableItems();

        // Display final total
        System.out.println();
        System.out.printf("Final total cost: %.2f euros%n",
                manager.calculateTotalCost());
    }
}
