import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner tempInput = new Scanner(System.in);
    int fahrenheitTemp = tempInput.nextInt();
    int celsiusTemp = (fahrenheitTemp - 32) * 5/9;
    System.out.println("Temperature in \u00B0Celsius: " + celsiusTemp);
    tempInput.close();
  }
}