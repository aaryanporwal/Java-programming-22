import java.util.*;

// Q3 Write a java program to compute the roots of a quadratic equation.

import java.math.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the values of a,b,c");
    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();
    double root1, root2;
    double determinant = b*b-4*a*c;
    if (determinant > 0) {
      root1=(-b+Math.sqrt(determinant))/(2*a);
      root2=(-b-Math.sqrt(determinant))/(2*a);
      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }
    else if(determinant==0) {
      root1=root2= -b/(2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }
    else {
      double real = -b/(2 * a);
      double imaginary = Math.sqrt(-determinant)/(2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  }
}