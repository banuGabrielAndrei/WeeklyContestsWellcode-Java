package week88;

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if (x == 2000 || x == 2004 || x == 2008) {
      System.out.println(x);
    } else if (x < 2004) {
      System.out.println(2004);
    } else if (x > 2004 && x < 2008) {
      System.out.println(2008);
    }
  }
}
