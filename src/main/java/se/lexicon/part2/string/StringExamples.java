package se.lexicon.part2.string;

public class StringExamples {
    public static void main(String[] args) {

       // String

        /*String greeting = "Hello";
        greeting = greeting.concat(" World");
        System.out.println(greeting);*/

        // Basic String Methods – length() and charAt()

        String str = "Hello, World!";
        System.out.println("String length: " + str.length() ); //output:13

        System.out.println("Character at index 0: " + str.charAt(0)); //output:l

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // Searching Inside a String – indexOf()
        String string = "Hello Strings";
        int index1 = string.indexOf("llo"); // Outcome: index2
        System.out.println("Index of 'llo': " + index1);
        int index2 = string.indexOf('H'); // Outcome:0
        System.out.println("Index of 'H': " + index2);

        int index3 = string.indexOf('S', 3); // Outcome: 6
        System.out.println("Index of 'S' starting at index 3: " + index3);
        int index4 = string.indexOf("Hell", 1);// Outcome:-1 means not found
        System.out.println("index4 = " + index4);

        // Extracting Parts – substring()
        String greeting = "Welcome";
        System.out.println(greeting.substring(3)); // output:come
        System.out.println(greeting.substring(1, 5));// Output:elco
        //System.out.println(greeting.substring(4, 10));// StringIndexOutOfBoundsException

        // Comparing Strings – equals() and equalsIgnoreCase()

        String str1 = "java";
        String str2 = "Java";

        System.out.println(str1.equals("java")); //Output:true
        System.out.println(str1.equals(str2)); //Output:false
        System.out.println(str1.equalsIgnoreCase(str2)); //Output:true

        // Changing Case – toUpperCase() and toLowerCase()
        String courseName = "Java";
        System.out.println(courseName.toUpperCase()); //Output:JAVA
        System.out.println(courseName.toLowerCase()); //Output:java

    }
}
