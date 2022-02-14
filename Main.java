import java.util.*;

// Q2 Write ajava program to display all factors of a given number. The number must be provided by the user during run time.

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.print("Factors of " + n + " are: ");
    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }   
  }   
}