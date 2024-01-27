package week91;

import java.util.*;

public class Problem2 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] v = new int[n];
    for (int i = 0; i < n; ++i) {
      v[i] = scanner.nextInt();
    }
    boolean odd1Exists;
    boolean odd2Exists;
    int counter = 0;
    for (int i = 0; i < n; ++i) {
      odd1Exists = odd2Exists = false;
      if (v[i] % 2 != 0) {
        for (int j = 0; j < n; ++j) {
          if (v[j] == v[i] + 1) {
            odd1Exists = true;
          } else if (v[j] == v[i] - 1) {
            odd2Exists = true;
          }
        }
      }
      if (odd2Exists && odd1Exists) {
        ++counter;
      }
    }
    if (counter == 0) {
      boolean even1Exists = false;
      boolean even2Exists = false;
      for (int i = 0; i < n; ++i) {
        even1Exists = even2Exists = false;
        if (v[i] % 2 == 0) {
          for (int j = 0; j < n; ++j) {
            if (v[j] == v[i] - 1) {
              even1Exists = true;
            } else if (v[j] == v[i] + 1) {
              even2Exists = true;
            }
          }
        }
      }
      if (even1Exists && even2Exists) {
        ++counter;
      }
    }
    System.out.println(counter);
  }
}
