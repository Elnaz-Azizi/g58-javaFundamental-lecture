package se.lexicon;

public class JavaFundamental1 {
    public static void main(String[] args) {

        // syntax:  [Data Type] [variableName] = [value];

        int speed;
        speed = 100;
        System.out.println("Speed is: " + speed);
        System.out.println("---------------------------------------------");

        //float salary = 5000.75F;
        double salary = 5000.75;
        System.out.println("Salary is: " + salary);
        System.out.println("--------------------------------------------");

        char grade = 'A';
        System.out.println("grade is: " + grade);

        char specialChar = '\u2764'; // Unicode character
        System.out.println("Unicode character is: " + specialChar);
        System.out.println("--------------------------------------------");

        boolean isMale = true;
        boolean isStudent = false;
        System.out.println("isMale is: " + isMale);
        System.out.println("isStudent is: " + isStudent);
        System.out.println("--------------------------------------------");

        byte temperature = 27;

        int width, height;

        // int SeatNumber; // incorrect
        int seatNumber1; // correct

        //int 1var; Incorrect
        //int &var; Incorrect

        int _temp; //acceptable not recommended

        //int class; Incorrect
        int studentClass; //correct
        System.out.println("----------------------------------------");
        // ### Assignment Operator (=) ###
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        System.out.println("number1 is: " + number1);
        System.out.println("number2 is: " + number2);
        System.out.println("----------------------------------------");

        //### compound assignment operators ###

        int n = 10;
        n += 5;  // n = n + 5 → 15
        // n -= 3;  // n = n - 3 → 12
        //n *= 2;  // n = n * 2 → 24
        //n /= 4;  // n = n / 4 → 6
        // n %= 3;  // n = n % 3 → 0
        System.out.println("n is: " + n);
        System.out.println("----------------------------------------");

        //### Arithmetic Operators(+  -  * /) ###  addition subtraction multiplication division

        int numberOne = 10;
        int numberTwo = 5;
        int additionResult = numberOne + numberTwo;
        int subtractionResult = numberOne - numberTwo;
        int multiplicationResult = numberOne * numberTwo;
        int division = numberOne / numberTwo;
        int modules = numberOne % numberTwo; // 10 % 3 is 1. (n%2==0)


        /* Type casting in Java is the process of converting a variable from one data type to another.
        This is essential when you need to assign a value of one type to a variable of another type.
        1. Widening Casting (Implicit): Automatically converts a smaller data type to a larger one.
        For example, converting an int to a double. This type of casting is safe and doesn't require explicit syntax.
        2. Narrowing Casting (Explicit): Manually converts a larger data type to a smaller one.
        For instance, converting a double to an int. This requires explicit casting because it can lead to data loss.*/

        // ### Increment (++) and Decrement (--) operators ###

        int number = 0;

        int counter = 0;

        // Pre-Increment/Pre-Decrement: ++counter or --counter
        System.out.println(++counter);

        // Post-Increment/Post-Decrement:
        System.out.println(number++);

        // ### Comparison Operators: (==, !=, <, >, <=, >=) ###

        int a = 10, b = 20;
        // Equal to
        System.out.println("a == b: " + (a == b));// false
        // Not equal to
        System.out.println("a != b: " + (a != b));// true
        // Greater than
        System.out.println("a > b: " + (a > b));
        // Less than
        System.out.println("a < b: " + (a < b));
        // Greater than or equal to
        System.out.println("a >= b: " + (a >= b));
        // Less than or equal to
        System.out.println("a <= b: " + (a <= b));

        // ### Selections or control flow statements ###
        // Types of Selection Statements in Java

        // if Statement

        /*int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }*/


        // if-else Statement
        int age = 16;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // if-else-if Ladder

        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");// if this condition meets, perform A
        } else if (marks >= 80) {
            System.out.println("Grade: B");// if this condition meets, perform B
        } else if (marks >= 70) {
            System.out.println("Grade: C"); // if this condition meets, perform C
        } else if (marks >= 55 && marks <= 60) {
            System.out.println("Grade: FX"); // if this condition meets, perform FX
        } else {
            System.out.println("Grade: F"); // if all the conditions fail, perform F
        }

        // switch Statement
        int day = 3;
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: // If a match is found, the code block under the matching case is executed.
                System.out.println("Wednesday");
                break; // The break statement is used to exit the switch block after a matching case has been executed.
            // Without break, execution will continue to the subsequent cases (known as "fall-through").
            default:
                System.out.println("Invalid day");
        }

        //String
        /*String firstName = "Elnaz";
        String lastName = "Azizi";
        String fullName = firstName.concat(" ") + lastName;
        System.out.println("Full name is: " + fullName);*/

        //Strings in java are immutable

        String greeting = "Hello";
        greeting.concat(" World!");
        System.out.println(greeting);

        greeting=greeting.concat(" World!");
        System.out.println(greeting);


        /* String firstName = "Erik";
        String lastName = "Svensson";
        int age1 = 42;
        String hobby = "Programming";*/

        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "Programming";

        Person anna = new Person();
        anna.firstName = "Anna";
        anna.lastName = "Andersson";
        anna.age = 54;
        anna.hobby = "Sports Cars";

        Person nils = new Person();
        nils.firstName = "Nils";
        nils.lastName = "Björk";
        nils.age = 27;
        nils.hobby = "Gaming";

        System.out.println(erik.getInformation());
        System.out.println(anna.getInformation());
        System.out.println(nils.getInformation());

        //Method

        //System.out.println("1. Addition");
        //System.out.println("2. Multiplication");

        displayMenu();

        printSum(10, 20);

        int sum = addition(5, 7);
        System.out.println(sum);

        double result = celsiusToFahrenheit(25);
        System.out.println(result);


    }

    //Method without a parameter and return type
    public static void displayMenu(){
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");

    }

    // Method with parameters and no return type (void)
    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum= " + sum);
    }

    // Methods with parameters and return type
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    // Methods That Perform a Specific Task (Real-Life Example)
    public static double celsiusToFahrenheit(double celsius) {
        // Formula(Business logic): (C × 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }


}
