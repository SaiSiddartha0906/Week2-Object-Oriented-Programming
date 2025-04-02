import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
    private String Bookname;
    private String Author;

    public Book(String author, String bookname) {
        this.Author = author;
        this.Bookname = bookname;
    }

    public void displaydetails(){
        System.out.println("Bookname :"+Bookname);
        System.out.println("Author : "+Author);
    }

    public String getBookname(){
        return Bookname;
    }
}
class Library {
    private String LibraryName;
    private List<Book> Books;

    public Library(String libraryName) {
        this.LibraryName = libraryName;
        this.Books=new ArrayList<>();
    }

    public void addBook(Book book){
        Books.add(book);
        System.out.println(book.getBookname()+"has been added to the library "+LibraryName);
    }

    public void displaydetails(){
        System.out.println("Library name "+LibraryName);
        for (Book book: Books){
            book.displaydetails();
            System.out.println();
        }
    }
}
public class LibraryandBook {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2);
        library2.addBook(book3);

        library1.displaydetails();
        library2.displaydetails();

    }
}
