import java.util.*;

// Q4 Design an EMI calculator that will calculate the EMI for any loan details.

public static void Main() {
  Scanner scanner = new Scanner(System.in);
  System.out.println(&quot;Enter P: &quot;);
  double p = scanner.nextDouble();
  System.out.println(&quot;Enter R: &quot;);
  double r = scanner.nextDouble();
  System.out.println(&quot;Enter N: &quot;);
  double n = scanner.nextDouble(); 
  r += 1;
  double q = Math.pow(r, n);
  double m = (p*q)/(q-1);
  System.out.println(&quot;Value of M is: &quot; + m);
}