package se.lexicon.part2.methodoverloading;

public class App {
    public static void main(String[] args) {
        int sumOfIntegers = MathOperations.add(20,30);
        System.out.println("sumOfIntegers = " + sumOfIntegers);

        double sumOfDoubles = MathOperations.add(20.5,30.5);
        System.out.println("sumOfDoubles = " + sumOfDoubles);

        long sumOfLongs = MathOperations.add(20000000000L,30000000000000000L);
        System.out.println("sumOfLongs = " + sumOfLongs);

        int sumOfVarargsNumbers= MathOperations.add(2,5,3,10);
        System.out.println("sumOfVarargsNumbers = " + sumOfVarargsNumbers);

        PaymentProcessor.processPayment("1234567890", "1234", 100.0);
        PaymentProcessor.processPayment("klagdfuegfu", 14000);


    }
}
