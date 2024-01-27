package week91;

import java.util.*;

public class Problem1 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int nr = scanner.nextInt();
    int[] v = new int[3];
    int index = 0;
    boolean isMountain = true;
    while (nr != 0) {
      v[index] = nr % 10;
      ++index;
      nr /= 10;
    }
    if (v[0] >= v[1] || v[2] >= v[1]) {
      isMountain = false;
    }
    if (isMountain) {
      System.out.print(v[2]);
    } else {
      System.out.print(v[0]);
    }
  }
}
