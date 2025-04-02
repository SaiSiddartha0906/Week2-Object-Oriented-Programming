import java.util.Scanner;
public class MobilePhone{
	private String brand;
	private String model;
	private int price;
	
	public MobilePhone(String brand,String model,int price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public void displayDetails(){
		System.out.println("The MobilePhone brand is: "+brand);
		System.out.println("The MobilePhone model is: "+model);
		System.out.println("The MobilePhone cost is: "+price);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the MobilePhone brand: ");
		String brand=input.nextLine();
		System.out.println("Enter the MobilePhone model: ");
		String model=input.nextLine();
		System.out.println("Enter the MobilePhone price: ");
		int price=input.nextInt();
		
		MobilePhone mobilephone1=new MobilePhone(brand,model,price);
		mobilephone1.displayDetails();
	}
}
		
		
		