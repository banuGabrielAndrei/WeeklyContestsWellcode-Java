package week90;

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if ((a != 1 && a != 4) && (b != 1 && b != 4)) {
      System.out.println("AMBELE NUMERE");
    } else if (a != 1 && a != 4) {
      System.out.println("a");
    } else if (b != 1 && b != 4) {
      System.out.println("b");
    } else {
      System.out.println("NICIUN NUMAR");
    }
  }
}