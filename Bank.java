public class Bank {
    private double amount;
    public Bank(double amount) {
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount) {     
        String result = (amount >= withdrawalAmount) ? "Withdrawal successful" : "Insufficient funds"; 
        System.out.println(result);
        amount = (amount >= withdrawalAmount) ? amount - withdrawalAmount : amount;
    }

    
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
    public static void main(String[] args) {
        
        Bank myBank = new Bank(10000);

        
        myBank.withdraw(5000);

        
        myBank.deposit(5000);

        
        myBank.displayBalance();
    }
}
