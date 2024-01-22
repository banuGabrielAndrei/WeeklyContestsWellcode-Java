package week86;

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    if (x == y && y == z) {
      System.out.println("mediu");
    } else if (x > y && x > z) {
      System.out.println("mare");
    } else {
      System.out.println("mic");
    }
  }
}
