abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Savings: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Savings: Withdrew " + amount);
        } else {
            System.out.println("Savings: Insufficient funds");
        }
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Current: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Current: Withdrew " + amount);
        } else {
            System.out.println("Current: Insufficient funds");
        }
    }
}
public class BankMain {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(5000);
        BankAccount ca = new CurrentAccount(10000);

	
	System.out.println("--------------------------------");
	System.out.println("Savings Balance: " + sa.getBalance());
        sa.deposit(1000);
	System.out.println("Savings Balance: " + sa.getBalance());
	System.out.println("--------------------------------");
        sa.withdraw(3000);
        System.out.println("Savings Balance: " + sa.getBalance());
	System.out.println("--------------------------------");


	System.out.println("--------------------------------");
	System.out.println("Current Balance: " + ca.getBalance());
        ca.withdraw(2000);
	System.out.println("Current Balance: " + ca.getBalance());
	System.out.println("--------------------------------");
        ca.deposit(500);
        System.out.println("Current Balance: " + ca.getBalance());
	System.out.println("--------------------------------");
    }
}

