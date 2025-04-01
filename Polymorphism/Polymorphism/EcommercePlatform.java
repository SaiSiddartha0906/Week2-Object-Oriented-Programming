import java.util.ArrayList;
import java.util.List;
abstract class Product{
    private int productID;
    private String name;
    private double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();
    public double calculateFinalPrice(double tax){
        return price + tax - calculateDiscount();
    }
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    private static final double TAX_RATE = 0.15;
    public Electronics(int proudctID,String name,double price){
        super(proudctID,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice() * 0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice() * TAX_RATE;
    }
    @Override
    public String getTaxDetails(){
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}
class Clothing extends Product implements Taxable{
    private static final double TAX_RATE = 0.05;
    public Clothing(int productID,String name,double price){
        super(productID,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice() * 0.20;
    }
    @Override
    public double calculateTax(){
        return getPrice() * TAX_RATE;
    }
    @Override
    public String getTaxDetails(){
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}
class Groceries extends Product{
    public Groceries(int productID,String name,double price){
     super(productID,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice() * 0.05;
    }
}
public class EcommercePlatform {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Electronics(101, "Laptop", 60000));
        productList.add(new Clothing(102, "Jacket", 3000));
        productList.add(new Groceries(103, "Apples", 200));
        for (Product product : productList) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            double finalPrice = product.calculateFinalPrice(tax);
            System.out.println("Final Price (with Tax and Discount): " + finalPrice);
            System.out.println();
        }
    }
}