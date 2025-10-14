package se.lexicon.part1;

import java.util.Scanner;

public class LoopExample1 {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Welcome");
        System.out.println("Goodbye");

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        //For Loop
        /* for (initialization; condition; increment) {
            // code to repeat
        }*/

        System.out.println("Basic Iteration:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Print even numbers among 1 and 10

        System.out.println("Even Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Number: " + i);
            }
        }

        // The continue Statement — Skipping a Turn

        System.out.println("Using continue to Skip an Iteration");
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Skipping 8...");
                continue;
            }
            System.out.println("Number: " + i);
        }

        //The break Statement — Stopping Completely

        System.out.println("Using break to Stop the Loop");
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Stopping at number 8...");
                break;
            }
            System.out.println("Number: " + i);
        }

        //While loop
        /*
        while (condition) {
                    // code to repeat
                }
                */
       /* System.out.println("-----------------------------------------");
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Count: " + counter);
            counter++;
        }

        Scanner scanner = new Scanner(System.in);
        boolean isAdult = true;

        // Example: Asking for the user's age in a loop until the input indicates they are a child.
        while (isAdult) {
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You are a child");
                isAdult = false; // Exit the loop when the condition is met
            }

            //scanner.nextLine(); sentence
            //scanner.next(); word
        }*/

        // Do-While Loop

        /*
        do {
            // code to repeat
        } while (condition);

         */

        System.out.println("Example: Do-While Loop");
        int num = 1;
        do {
            System.out.println("Iteration " + num);
            num++;
        } while (num <= 5);



        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPassword = "ABC123";

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.\n");
            }
        } while (!password.equals(correctPassword));

        System.out.println("Access granted! Welcome back.");


    }
}
