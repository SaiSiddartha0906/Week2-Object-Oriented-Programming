import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = ((getPrice() * getQuantity()) + additionalCharge) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + ", Additional Charge: " + additionalCharge;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        vegItem.applyDiscount(10);
        order.add(vegItem);

        NonVegItem nonVegItem = new NonVegItem("Chicken Curry", 300, 1, 50);
        nonVegItem.applyDiscount(5);
        order.add(nonVegItem);

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}