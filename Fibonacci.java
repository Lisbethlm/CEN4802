public class Fibonacci {

    public static int fibonacci(int n) {

/**
 * Recursive method to calculate the nth term in the Fibonacci sequence.
 * 
 * @param n the position in the Fibonacci sequence (1-based index).
 * @return the nth term in the Fibonacci sequence.
 */

        if (n <= 0) {
            throw new IllegalArgumentException("n should be a positive integer.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change this integer to experiment with outputs.
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}


