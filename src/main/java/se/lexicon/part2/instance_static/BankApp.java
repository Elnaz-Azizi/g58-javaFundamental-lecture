package se.lexicon.part2.instance_static;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Mehrdad";
        account1.balance = 1000;

        BankAccount account2 = new BankAccount();
        account2.accountHolder = "Marcus";
        account2.balance = 2000;

        account1.deposit(500);
        account2.withdraw(100);
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        double loanRepayment = BankAccount.calculateLoanRepayment(10000, 10);
        System.out.println("loanRepayment = " + loanRepayment);


    }
}
