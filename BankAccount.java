package Java_week3;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.accountBalance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Anil bhatta", 1000);
        account.printAccountInfo();

        account.deposit(500);
        account.withdraw(300);

        System.out.println("\nAfter transactions:");
        account.printAccountInfo();
    }
}

