import java.util.Scanner;
public class Student{
	private String name;
	private String rollNumber;
	private int marks;
	
	public Student(String name,String rollNumber,int marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	public String grade(int marks){
        if (marks < 0 || marks > 100) {
            return "Invalid marks! Please enter a value between 0 and 100.";
        } else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
	
	public void displayDetails(){
		System.out.println("Name of the Student :"+name);
		System.out.println("Roll Number of the Student :"+rollNumber);
		System.out.println("Marks obtained by the Student :"+marks);
		System.out.println("Grade obtained by the Student :"+grade(marks));
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the Student : ");
		String name=input.nextLine();
		System.out.println("Enter the rollNumber of the Student : ");
		String rollNumber=input.nextLine();
		System.out.println("Enter the marks of the Student : ");
		int marks=input.nextInt();
		Student student1=new Student(name,rollNumber,marks);
		student1.displayDetails();
	}
}
		
		
		