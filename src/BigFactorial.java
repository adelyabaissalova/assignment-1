import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

    static BigInteger factorial(int n) {
        if (n == 0 ) return BigInteger.ONE;
        if (n == 1 ) return BigInteger.ONE ;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter а number: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}