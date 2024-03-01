import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n;
        int rev = 0, r = 0;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == m)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number in not a palindrome");
    }
}
