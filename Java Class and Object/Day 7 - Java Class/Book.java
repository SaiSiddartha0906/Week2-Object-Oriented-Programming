import java.util.Scanner;
public class Book{
	private String title;
	private String author;
	private int price;
	
	public Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void displayBookDetails(){
		System.out.printf("Title of the book is: %s\n",title);
		System.out.printf("Author of the book is: %s\n",author);
		System.out.printf("Price of the book is: %d\n",price);
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter the Title of the book :\n");
		String title=input.nextLine();
		System.out.printf("Enter the Author of the book :\n");
		String author=input.nextLine();
		System.out.printf("Enter the Price of the book :\n");
		int price=input.nextInt();
		Book book1=new Book(title,author,price);
		book1.displayBookDetails();
	}
}
	