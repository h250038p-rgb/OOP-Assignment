import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S-1001", 1000.00, 200.00));
        accounts.add(new CurrentAccount("C-2001", 300.00, 500.00));
        accounts.add(new SavingsAccount("S-1002", 500.00, 100.00));
        accounts.add(new CurrentAccount("C-2002", 1000.00, 200.00));

        System.out.println("=== Opening balances ===");
        for (Account a : accounts) {
            System.out.printf("[%s] %.2f%n", a.getAccountNumber(), a.getBalance());
        }

        System.out.println("\n=== Invalid deposit ===");
        accounts.get(0).deposit(-50);

        System.out.println("\n=== Round 1: withdraw 700 from every account ===");
        for (Account a : accounts) {
            a.withdraw(700.00);   // polymorphic call, no casting
        }

        System.out.println("\n=== Round 2: withdraw 150 from every account ===");
        for (Account a : accounts) {
            a.withdraw(150.00);
        }

        System.out.println("\n=== End of month ===");
        for (Account a : accounts) {
            a.endOfMonth();       // polymorphic call, no casting
        }

        System.out.println("\n=== Closing balances ===");
        for (Account a : accounts) {
            System.out.printf("[%s] %.2f%n", a.getAccountNumber(), a.getBalance());
        }
    }
}
