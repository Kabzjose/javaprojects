import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Account {
    // Private fields: hidden from outside access (Encapsulation)
    private String ownerName;
    private double balance;
    private ArrayList<String> history;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.history = new ArrayList<>();
        this.history.add(String.format("Account Created for %s with balance: %.2f", ownerName, balance));
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        history.add(String.format("Deposited: \"%.2f\" Balance: \"%.2f\"", amount, balance));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            history.add(String.format("Withdrew: \"%.2f\" Balance: \"%.2f\"", amount, balance));
        }
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        for (String record : history) {
            System.out.println(record);
        }
    }
}

public class bankSystem { // Capitalized class name (Java convention)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account myAccount = new Account("John", 100.0);

        System.out.println("Welcome, " + myAccount.getOwnerName() + "!");

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // Safe input handling
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number (1-5).");
                scanner.nextLine(); // Clear the bad input from the scanner buffer
                continue;
            }
            scanner.nextLine(); // Consume leftover newline

            if (choice == 1) {
                System.out.printf("Balance: %.2f%n", myAccount.getBalance());
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                try {
                    double amt = scanner.nextDouble();
                    myAccount.deposit(amt);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid amount entered.");
                    scanner.nextLine();
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                try {
                    double amt = scanner.nextDouble();
                    myAccount.withdraw(amt);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid amount entered.");
                    scanner.nextLine();
                }
            } else if (choice == 4) {
                System.out.println("\n--- Transaction History ---");
                myAccount.showHistory();
            } else if (choice == 5) {
                System.out.println("Thank you for banking with us. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please pick 1 through 5.");
            }
        }
        scanner.close();
    }
}
