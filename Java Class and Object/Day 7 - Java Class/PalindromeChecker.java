import java.util.Scanner;
public class PalindromeChecker{
	private String text;
	
	public PalindromeChecker(String text){
		this.text=text.toLowerCase();
	}
	
	public String checkpalindrome(){
		int left=0;
		int right=text.length()-1;
		while (left<right){
			if (text.charAt(left)!=text.charAt(right)){
				return "Not a Palindrome";
			}
			left++;
			right--;
		}
		return "It is a Palindrome";
	}

	public void displayDetails(){
		System.out.println(text+" "+ checkpalindrome());
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the text :");
		String text=input.nextLine();
		PalindromeChecker obj1=new PalindromeChecker(text);
		obj1.displayDetails();
	}
}