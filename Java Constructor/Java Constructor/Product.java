import java.util.Scanner;

public class Product {
    private String productName;
    private double price;
    private static int totalproducts = 0;

    public Product(String productName,double price) {
        this.price = price;
        this.productName = productName;
        Product.totalproducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product name :" + productName);
        System.out.println("Price : " + price);

    }

    public static void displayTotalProducts() {
        System.out.println("Count of total Products is :"+Product.totalproducts);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for display products\n2. for total products count\n3. to exit");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 3) {
                break;
            } else if (choice == 1) {
                System.out.println("Enter the product name :");
                String productname = input.nextLine();

                System.out.println("Enter the price :");
                double price = input.nextDouble();

                Product product1 = new Product(productname, price);
                product1.displayProductDetails();
            } else {
                Product.displayTotalProducts();
            }
            ;
        }
    }
}


