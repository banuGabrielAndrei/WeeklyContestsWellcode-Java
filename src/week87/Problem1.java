package week87;

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a >= x && b >= y * x) {
      System.out.println("Ajung");
    } else {
      System.out.println("Nu ajung");
    }
  }
}
