public class Book {

    static String libraryName="SRM";
    final int isbn;
    String title;
    String author;

    public Book(int isbn,String title,String author) {
        this.isbn = isbn;
        this.title=title;
        this.author=author;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void display(){
        if(this instanceof Book){
            System.out.println("ISBN: "+isbn);
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);

        }else{
            System.out.println("invalid");
        }

    }

    public static void main(String[] args) {
        Book b1= new Book(123456,"book","Hero");
        Book.displayLibraryName();
        b1.display();


    }
}
