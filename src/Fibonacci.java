public class Fibonacci {

    static int callCount = 0;

    static int fib(int n) {
        callCount++;

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        callCount = 0;
        int result = fib(n);

        System.out.println(result);
        System.out.println( callCount);
    }
}