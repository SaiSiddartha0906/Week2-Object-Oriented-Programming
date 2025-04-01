import java.util.*;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Item name: " + itemName);
        System.out.println("Item price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public int addItem(int newQuantity) {
        quantity += newQuantity;
        return quantity;
    }

    public int removeItem(int newQuantity) {
        quantity -= newQuantity;
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        List<CartItem> cart = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the item name: ");
            String itemName = input.nextLine();

            CartItem existingItem = null;
            for (CartItem item : cart) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    existingItem = item;
                    break;
                }
            }

            if (existingItem != null) {
                System.out.println("Enter 1 to add to quantity\n2 to remove from quantity: ");
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("Enter the quantity to add: ");
                    int newQuantity = input.nextInt();
                    existingItem.addItem(newQuantity);
                } else if (choice == 2) {
                    System.out.println("Enter the quantity to remove: ");
                    int newQuantity = input.nextInt();
                    existingItem.removeItem(newQuantity);
                } else {
                    System.out.println("Invalid choice. Returning to menu.");
                }
                input.nextLine(); // Consume newline
            } else {
                System.out.println("Enter the item price: ");
                double itemPrice = input.nextDouble();

                System.out.println("Enter the quantity: ");
                int quantity = input.nextInt();
                input.nextLine(); // Consume newline

                CartItem newItem = new CartItem(itemName, itemPrice, quantity);
                cart.add(newItem);
            }

            System.out.println("Enter 1 to continue shopping\n2 to finish: ");
            int continueChoice = input.nextInt();
            input.nextLine(); // Consume newline
            if (continueChoice != 1) {
                break;
            }
        }

        // Display all items and calculate total cost
        double totalCost = 0.0;
        System.out.println("\nCart Details:");
        for (CartItem item : cart) {
            item.displayDetails();
            totalCost += item.getQuantity() * item.getPrice();
            System.out.println("----------");
        }

        System.out.println("Total cost: " + totalCost);
    }
}