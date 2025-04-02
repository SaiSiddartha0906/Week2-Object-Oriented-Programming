import java.util.*;

public class Book4 {
    private final String title;
    private final String author;
    private final int price;
    private boolean availability;

    public Book4(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability=true;
    }
    public void displayDetails(){
            System.out.println("Title of the book :"+title);
            System.out.println("Author of the book :"+author);
            System.out.println("Price of the book :"+price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        }

    public void borrow(){
            if (availability){
                availability=false;
                System.out.println("You have successfully borrowed the book");
            }
            else{
                System.out.println("Sorry the book has already been taken");
            }
    }

    public String getTitle(){
        return title;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Book4> Available_books=new ArrayList<>();
        Available_books.add(new Book4("Secret","Rhonda",500));
        Available_books.add(new Book4("Death Note","Light",1000));

        while(true){
            System.out.println("Enter 1 to View available books\n 2.To borrow a book\n 3. To Exit ");
            int choice=input.nextInt();
            input.nextLine();
            if (choice==3){
                break;
            }
            else if (choice==1){
                for (Book4 book:Available_books){
                    book.displayDetails();
                    System.out.println();
                }
            }
            else {
                System.out.println("Enter the book name :");
                String title = input.nextLine();
                boolean bookfound = false;
                for (Book4 book : Available_books) {
                    if (book.getTitle().equalsIgnoreCase(title)){
                    book.borrow();
                    bookfound = true;
                    break;
                }
            }
            if (!bookfound){
                System.out.println("Book is not present");
            }
        }
    }
}
}
