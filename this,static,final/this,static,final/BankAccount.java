public class BankAccount {

    static String bankName="DBS";
    static int count=0;
    String accountHolderName;
    final int acountNumber;


    public BankAccount(String accountHolderName, int acountNumber) {
        this.accountHolderName = accountHolderName;
        this.acountNumber = acountNumber;
        count++;
    }

    static void getTotalAccounts(){
        System.out.println("Total Bank Accounts: "+count);
    }

    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Number: "+acountNumber);
            System.out.println("Account Holder Name: "+accountHolderName);

        }else{
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Jhon",414);
        BankAccount b2=new BankAccount("Alice",413);

        b1.displayAccountDetails();
        b2.displayAccountDetails();

        BankAccount.getTotalAccounts();

    }
}
