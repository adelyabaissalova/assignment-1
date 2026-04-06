import java.util.Scanner;

public class StringPermutation {

    static void permute(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            char c = remaining.charAt(i);
            String newPrefix = prefix + c;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permute(newPrefix, newRemaining);
        }
    }

    static void printPermutations(String s) {
        permute("", s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        printPermutations(s);

    }
}