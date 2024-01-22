package week86;

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Integer[][] mt = new Integer[n + 1][n + 1];

    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= n; ++j) {
        mt[i][j] = scanner.nextInt();
      }
    }
    int col = 0, max = 0;
    for (int j = 1; j <= n; ++j) {
      int[] fr = new int[101];
      for (int i = 1; i <= n; ++i) {
        ++fr[mt[i][j]];
      }
      for (int k = 0; k < 101; ++k) {
        if (fr[k] >= max) {
          max = fr[k];
          col = j;
        }
      }
      // System.out.println(max + " " + col);
    }
    System.out.println(col);
  }
}
