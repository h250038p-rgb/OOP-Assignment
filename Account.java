public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double Balance) {
        this.accountNumber = accountNumber;
        this.balance = Balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            
        }else {

        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    }
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public abstract void withdraw(double amount);

    public abstract void endOfMonth();
}
