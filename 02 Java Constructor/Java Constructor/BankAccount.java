import java.util.*;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added! Current balance: " + getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "John Doe", 1000, 5));
        accounts.add(new SavingsAccount(102, "Jane Smith", 2000, 3));

        while (true) {
            System.out.println("Enter 1 to View accounts\n2. Deposit\n3. Withdraw\n4. Add interest\n5. Exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 5) {
                break;
            }

            System.out.println("Enter account number:");
            int accountNumber = input.nextInt();
            input.nextLine();
            BankAccount account = null;

            for (BankAccount acc : accounts) {
                if (acc.accountNumber == accountNumber) {
                    account = acc;
                    break;
                }
            }

            if (account == null) {
                System.out.println("Account not found!");
                continue;
            }

            switch (choice) {
                case 1:
                    account.displayDetails();
                    break;
                case 2:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).addInterest();
                    } else {
                        System.out.println("Interest can only be added to Savings Accounts!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
