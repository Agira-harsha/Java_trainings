package EncapsulationTopic;
public class BankRunner {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("B.harshaKohli","632457ICIC",45000);
        account.viewDetails();

        account.deposit(100000);
        account.viewDetails();

        account.withdraw(200000);
        account.viewDetails();

    }
}
