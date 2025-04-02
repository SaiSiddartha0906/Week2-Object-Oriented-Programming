import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Atomic Habits";
        author = "James Clear";
        price = 300;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title of the book :" + title);
        System.out.println("Author of the book :" + author);
        System.out.println("Price of the book :" + price);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book1 = new Book();
        book1.displayDetails();
        Book book2 = new Book("The Source of happiness", "Gopal Krishna Goswami", 150);
        book2.displayDetails();
    }
}
