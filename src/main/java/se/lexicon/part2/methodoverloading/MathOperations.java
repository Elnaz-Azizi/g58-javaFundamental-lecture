package se.lexicon.part2.methodoverloading;

public class MathOperations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    /*
        add(int a, int b, int c)`
        add(int a, int b, int c, int d)`
        add(int a, int b, int c, int d, int e)`

     */

    // varargs

    public static int add(int... numbers) { // (2, 5, 3, 10)
        int sum =0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }



    /*
    0+2=2
    2+5=7
    7+3=10
    10+10=20
     */

}
