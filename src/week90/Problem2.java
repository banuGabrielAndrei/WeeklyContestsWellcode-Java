package week90;

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] mt = new int[n][n];
    int max = -1;
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        mt[i][j] = scanner.nextInt();
        if (mt[i][j] > max) {
          max = mt[i][j];
        }
      }
    }
    boolean validMax = false;
    for (int i = 0; i < n; ++i) {
      if (mt[i][i] == max) {
        validMax = true;
      }
    }
    if (validMax) {
      System.out.println(max);
    } else {
      System.out.println("NU EXISTA");
    }
  }
}
