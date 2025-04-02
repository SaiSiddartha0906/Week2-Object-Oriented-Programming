import java.util.Scanner;
public class BankAccount{
	private String accountHolder;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String accountHolder,String accountNumber,int balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void MoneyDeposit(int money){
		if (money<=0){
			System.out.println("Insufficient amount to be deposited");
		}
		else{
		balance=money+balance;
		System.out.println("Money has been depositied succesfully");
		}
	}

	
	public void WithdrawMoney(int money){
		if (money>balance){
			System.out.println("Insufficient amount to be withdraw\n");
		}
		else{
			balance=balance-money;
			System.out.println("Money has been withdrawn succesfully\n");
		}
	}
	
	public void displayDetails(){
			System.out.println("Accountholder name :"+accountHolder);
			System.out.println("AccountNumber:"+accountNumber);
			System.out.println("Current balance :"+balance);
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Account holder name :");
		String accountHolder=input.nextLine();
		System.out.println("Enter the Account Number name :");
		String accountNumber=input.nextLine();
		System.out.println("Enter the initial money to be depositied:");
		int balance=input.nextInt();
		BankAccount bankaccount1=new BankAccount(accountHolder,accountNumber,balance);
		System.out.println("Enter the number 1.Deposit Money  2. Withdraw money :");
		int choice=input.nextInt();
		if (choice==1){
			System.out.println("Enter the money to be depositied:");
			int money=input.nextInt();
			bankaccount1.MoneyDeposit(money);
			bankaccount1.displayDetails();
		}
		else{
			System.out.println("Enter the money to be withdrawn:");
			int money=input.nextInt();
			bankaccount1.WithdrawMoney(money);
			bankaccount1.displayDetails();
		}
	}
}
		
		
			
		
	