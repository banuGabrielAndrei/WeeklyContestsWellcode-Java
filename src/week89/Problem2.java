package week89;

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    boolean sameParity = a % 2 == b % 2;
    boolean aParity = a % 2 == 0;
    if (sameParity) {
      if (aParity) {
        System.out.print(a);
        for (int i = 1; i <= c - 2; ++i) {
          System.out.print(8);
        }
        System.out.print(b);
      } else {
        System.out.print(a);
        for (int i = 1; i <= c - 2; ++i) {
          System.out.print(9);
        }
        System.out.print(b);
      }
    } else {
      int nr = (a + b) / 2;
      if (nr % 2 == 0) {
        for (int i = 1; i <= c; ++i) {
          System.out.print(8);
        }
      } else {
        for (int i = 1; i <= c; ++i) {
          System.out.print(9);
        }
      }
    }
  }
}
