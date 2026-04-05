package org.example;

public class ExampleNonlocalMath {
    public ExampleNonlocalMath() {
    }

    // Returns the square of a number
    public static int square(int x) {
        return x * x;
    }

    // Returns the sum of two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Returns a random integer between min (inclusive) and max (exclusive)
    public static int randomIntInRange(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }

    // Returns true if the number is even
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    // Returns the factorial of a number (recursive)
    public static long factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
}
