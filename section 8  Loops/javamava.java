import java.util.Scanner;

public class javamava {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int m = n;
      int arm = 0;
      int r = 0;
      while (n > 0) {

        r = n % 10;
        n = n / 10;

        arm = (r * r * r) + arm;

      }
      if (arm == m)
        System.out.println("is a armstrong number");
      else
        System.out.println("Is not a Armstrong number");
    }

  }
}