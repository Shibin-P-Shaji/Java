import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    private static int nextAccountNumber = 1001;
    static int accountCount = 0;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber++;
        accountCount++;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("FAILED - Invalid amount or insufficient funds");
            return false;
        }

        this.balance -= amount;
        receiver.balance += amount;

        Transaction txn = new Transaction(this.accountNumber, receiver.accountNumber, amount, "Success");
        txn.printTransaction();
        return true;
    }
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    public void printTransaction() {
        System.out.println("\nTransaction Details:");
        System.out.println("From Account #: " + fromAccount);
        System.out.println("To Account #: " + toAccount);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + status);
    }
}

public class BankPassbook {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Anitta", 5000);
	Scanner sc = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
        BankAccount acc2 = new BankAccount("Vinisha", 3000);

        System.out.println("Initial Balance:");
        System.out.println(acc1.getAccountHolder() + ": $" + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + ": $" + acc2.getBalance());

        acc1.transfer(acc2, 1500);

        System.out.println("\nAfter Transfer:");
        System.out.println(acc1.getAccountHolder() + ": $" + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + ": $" + acc2.getBalance());

        System.out.println("\nTotal Bank Accounts: " + BankAccount.accountCount);
    }
}
