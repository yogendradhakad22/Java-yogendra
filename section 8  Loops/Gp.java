import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        int n, a, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        System.out.println("Enter common ratio: ");
        System.out.println("Enter number of digits: ");
        a = scanner.nextInt();
        r = scanner.nextInt();
        n = scanner.nextInt();
        int term=a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+" ");
            term = term * r;

    }
}
}