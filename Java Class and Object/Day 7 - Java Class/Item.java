import java.util.Scanner;
public class Item{
	private double itemCode;
	private String itemName;
	private int price; 
	
	public Item(double itemCode,String itemName,int price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	public void displayDetails(){
		System.out.println("Item code is: "+itemCode);
		System.out.println("Item Name is: "+itemName);
		System.out.println("Price of the Item is: "+price);
	}
	
	public int totalcost(int quantity){
		return quantity*price;
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Item code: ");
		double itemCode=input.nextDouble();
		input.nextLine();
		System.out.println("Enter the Item Name: ");
		String itemName=input.nextLine();
		System.out.println("Enter the Item Price: ");
		int price=input.nextInt();
		Item item1=new Item(itemCode,itemName,price);
		item1.displayDetails();
		System.out.println("Enter the Quantity: ");
		int quantity=input.nextInt();
		int totalcost=item1.totalcost(quantity);
		System.out.println("The total cost is: "+totalcost);
	}
}
		
		
		