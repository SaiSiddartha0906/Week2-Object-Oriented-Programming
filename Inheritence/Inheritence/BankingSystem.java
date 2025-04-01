class BankAccount {
    String accountNumber;
    double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;


    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;


    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int depositTerm;


    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}


public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA123", 1000.00, 2.5);
        CheckingAccount checking = new CheckingAccount("CA456", 500.00, 300.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.00, 12);


        System.out.println("\nSavings Account:");
        savings.displayAccountType();
        savings.displayAccountDetails();

        System.out.println("\nChecking Account:");
        checking.displayAccountType();
        checking.displayAccountDetails();

        System.out.println("\nFixed Deposit Account:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}