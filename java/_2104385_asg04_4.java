class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Earned: $" + interest);
        System.out.println("New Balance (including interest): $" + balance);
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
}

public class _2104385_asg04_4{
    public static void main(String[] args) {
        // Creating a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("IA123456", "Anjali Singh", 1000.00, 2.5);
        savingsAccount.displayAccountDetails();
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(200.00);

        System.out.println();

        // Creating a Checking Account
        CheckingAccount checkingAccount = new CheckingAccount("IA654321", "Sanjana Singh", 500.00);
        checkingAccount.displayAccountDetails();
        checkingAccount.deposit(300.00);
        checkingAccount.withdraw(700.00);
    }
}
