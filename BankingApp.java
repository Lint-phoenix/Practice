import java.util.Scanner;

// Custom exception for invalid inputs
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) throws InvalidInputException {
        if (balance < 0) {
            throw new InvalidInputException("Initial balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidInputException {
        if (amount <= 0) {
            throw new InvalidInputException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("✅ Deposited: " + amount);
    }

    public void withdraw(double amount) throws InvalidInputException {
        if (amount <= 0) {
            throw new InvalidInputException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InvalidInputException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("✅ Withdrawn: " + amount);
    }

    public void displayBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();

            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();

            BankAccount account = new BankAccount(name, initialBalance);

            while (true) {
                System.out.println("\n--- Banking Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            double depositAmount = sc.nextDouble();
                            account.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawAmount = sc.nextDouble();
                            account.withdraw(withdrawAmount);
                            break;
                        case 3:
                            account.displayBalance();
                            break;
                        case 4:
                            System.out.println("Thank you for banking with us!");
                            return;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                } catch (InvalidInputException e) {
                    System.out.println("⚠️ Error: " + e.getMessage());
                }
            }
        } catch (InvalidInputException e) {
            System.out.println("⚠️ Error creating account: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
