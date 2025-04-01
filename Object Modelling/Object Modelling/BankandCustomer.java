import java.util.*;
class Customer{
    private String Customername;
    private int Bankaccountno;
    private double balance;

    public Customer(String customername, int bankaccountno, double balance) {
        this.Customername = customername;
        this.Bankaccountno = bankaccountno;
        this.balance = balance;
    }

    public double getbalance(){
        return balance;
    }

    public void viewBalance(){
        System.out.println("Balance is :"+getbalance());
    }

    public void displayDetails(){
        System.out.println("customer name :"+Customername);
        System.out.println("Bank account no : "+Bankaccountno);
        System.out.println("Balance "+balance);
    }
}
class Bank {
    private static final String Bankname = "ABC Bank";
    private List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }

    public void OpenAccount(Customer customer) {
        customerList.add(customer);
    }

    public void displaydetails() {
        for (Customer customer : customerList) {
            System.out.println("Bank Name");
            customer.displayDetails();
        }
    }
}
public class BankandCustomer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Bank bank1=new Bank();

        Customer customer1 = new Customer("Alice", 101, 5000.0);
        Customer customer2 = new Customer("Bob", 102, 10000.0);

        bank1.OpenAccount(customer1);
        bank1.OpenAccount(customer2);

        bank1.displaydetails();
        System.out.println();

        customer1.viewBalance();
        customer2.viewBalance();

        }
    }

