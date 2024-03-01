import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+", ");
       for (int i =2;i <n; i++) {
        
        System.out.print(b+", ");
        int c=a+b;
        a=b;
        b=c;

    }
    
}
}