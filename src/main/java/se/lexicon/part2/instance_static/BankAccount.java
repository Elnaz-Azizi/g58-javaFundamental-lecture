package se.lexicon.part2.instance_static;

public class BankAccount {
    static double interestRate = 6.5;

    String accountHolder; //instance field
    double balance;

    public void deposit(double amount) {
        // ‘this’ means: update the balance of the object I'm called on
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder
                + ", Balance: " + balance + ", Interest Rate: " + interestRate + "%");
    }

    public static double calculateLoanRepayment(double amount, int years) {
        double totalRepayment = amount + (amount * (interestRate / 100) * years);
        return totalRepayment;
    }




}
