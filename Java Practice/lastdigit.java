import java.util.Scanner;

public class lastdigit {

    public static void main(String[] args) {
        System.out.println("Enter a valid digit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cout = 0;
        while (n > 0) {
            n = n / 10;
            cout++;

        }
        System.out.println(cout);
    }
}
