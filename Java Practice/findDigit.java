package Java;

import java.util.Scanner;

public class findDigit {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a =sc.nextInt();
    int fact=1;
    for (int i;i<=a;i++) 
    fact = fact*i;
    System.out.println(fact);


      
  }
  
}
