import java.util.Scanner;
public class Employee{
	private String name;
	private String id;
	private int salary;
	
	public Employee(String name, String id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void displayDetails(){
		System.out.println("Employee Name :"+ name);
		System.out.println("Employee ID :"+ id);
		System.out.println("Employee Salary :"+ salary);
	}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Employee name :");
		String name=input.nextLine();
		System.out.println("Enter the Employee id :");
		String id=input.nextLine();
		System.out.println("Enter the Employee Salary :");
		int salary=input.nextInt();
		Employee employee1=new Employee(name,id,salary);
		employee1.displayDetails();
	}
}		