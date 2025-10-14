package se.lexicon.part2.methodoverloading;

public class PaymentProcessor {

            // Credit card payments
        public static void processPayment(String cardNumber, String cvv, double amount){
            System.out.println("Processing credit card payment...");
            System.out.println("Card: " + cardNumber + ", Amount: " + amount);
        }

        // Bank transfer payments
        public static void processPayment(String bankAccount, String swiftCode, double amount, String currency) {
            System.out.println("Processing bank transfer...");
            System.out.println("Bank Account: " + bankAccount + ", Amount: " + amount + " " + currency);
        }

        // Mobile wallet payments
        public static void processPayment(String walletId, double amount) {
            System.out.println("Processing mobile wallet payment...");
            System.out.println("Wallet ID: " + walletId + ", Amount: " + amount);
        }

    }
