package EncapsulationTopic;
public class BankAccount {

    private String holderName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String holderName ,String accountNumber, double initialBalance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getHolderName() {
        return holderName;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful.. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

     void viewDetails(){
        System.out.println("HolderName :" + holderName);
        System.out.println("accountNumber :" + accountNumber);
        System.out.println("balance :" + balance+"\n");
    }

}
