import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        System.out.println("Enter a valid digit");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }

}
