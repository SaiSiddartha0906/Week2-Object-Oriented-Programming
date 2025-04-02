import java.util.*;

class Customer1{
    private String CustomerName;
    private List<Order> orderList;

    public Customer1(String customerName) {
        CustomerName = customerName;
        this.orderList=new ArrayList<>();
    }

    public void addOrders(Order order){
        orderList.add(order);
    }

    public void displayDetails(){
        System.out.println("Customer Name : "+CustomerName);
        for(Order order:orderList){
            order.displayDetails();
        }
    }
}
class Order{
    private String OrderID;
    private List<Product> productList;

    public Order(String orderID) {
        OrderID = orderID;
        this.productList=new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public void displayDetails(){
        System.out.println("Order Details : "+OrderID);
        for (Product product:productList){
            System.out.println("Products : "+product.getProductName());
        }
    }
}

class Product{
    private String ProductName;

    public Product(String productName) {
        ProductName = productName;
    }

    public String getProductName(){
        return ProductName;
    }
}
public class OrdersandProducts {
    public static void main(String[] args) {
        Customer1 customer1=new Customer1("Surya");
        Customer1 customer2=new Customer1("Vardhan");

        Product product1=new Product("Butter");
        Product product2=new Product("Jam");

        Order order1=new Order("A12");
        Order order2=new Order("A13");

        order1.addProduct(product1);
        order1.addProduct(product2);

        order2.addProduct(product1);

        customer1.addOrders(order1);

        customer2.addOrders(order2);

        customer1.displayDetails();
        System.out.println();
        customer2.displayDetails();
    }
}
