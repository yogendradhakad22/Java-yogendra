import java.util.Scanner;

public class arm {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arm, r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            arm = arm + (r * r * r);
        }
        if (arm == n)
            System.out.println(n + " is a armstrong number");
        else
            System.out.println(n + " is not a strong number");
    }
}