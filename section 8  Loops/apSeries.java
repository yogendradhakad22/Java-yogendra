import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number and common difference");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            a = a + d;

        }

    }
}
