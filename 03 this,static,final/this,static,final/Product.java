import java.util.Scanner;

public class Product {

    static double discount;
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    static void updateDiscount(double discount){
        System.out.println("Old discount is: "+discount);
        discount=20;
        System.out.println("updated Discount is: "+discount);

    }
    public void Display(){
        if(this instanceof Product){
            System.out.println("Product Name: "+productName);
            System.out.println("Price: "+price);
            System.out.println("Quantity: "+quantity);
        }
    }

    public static void main(String[] args) {
        Product p1=new Product("Pen",10,4);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter discount amount..");
        discount=scanner.nextDouble();
        p1.Display();
        Product.updateDiscount(discount);
    }
}
