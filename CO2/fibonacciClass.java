class FibonacciRecursion {

    static int callCount = 0;  // static variable to track number of recursive calls

    public static int fibonacci(int n) {
        callCount++;  // increment on each function call
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class fibonacciClass {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci terms to print

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciRecursion.fibonacci(i) + " ");
        }

        System.out.println("\n\nTotal recursive calls made: " + FibonacciRecursion.callCount);
    }
}
