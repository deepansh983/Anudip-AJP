// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class that handles deposits and withdrawals
class BankAccount {
    private double balance;

    // Constructor to initialize the account with a given balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to perform transactions (deposits and withdrawals)
    public void performTransaction(double amount) throws InsufficientFundsException {
        if (amount < 0) { // Withdrawal
            if (Math.abs(amount) > balance) {
                throw new InsufficientFundsException("Insufficient funds for the withdrawal.");
            } else {
                balance += amount; // amount is negative, so this subtracts it
            }
        } else { // Deposit
            balance += amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate the BankAccount class and handle exceptions
public class Bank1{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Initialize account with $1000

        // Transactions to demonstrate functionality
        double[] transactions = {200.00, -150.00, -900.00, -200.00, 300.00};

        for (double amount : transactions) {
            try {
                account.performTransaction(amount);
                System.out.println("Transaction of " + amount + " completed. New balance: " + account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println("Transaction of " + amount + " failed: " + e.getMessage());
            }
        }

        // Final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
