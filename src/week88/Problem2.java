package week88;

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < n; ++i) {
      int value = scanner.nextInt();
      if (isPrime(Math.abs(value))) {
        sum += value;
      }
    }
    System.out.println(sum);
  }

  public static boolean isPrime(int nr) {
    if (nr <= 1) {
      return false;
    }
    for (int div = 2; div * div <= nr; ++div) {
      if (nr % div == 0) {
        return false;
      }
    }
    return true;
  }
}
