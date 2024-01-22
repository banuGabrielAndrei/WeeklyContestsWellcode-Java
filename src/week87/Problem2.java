package week87;

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    Integer[] v = new Integer[21];
    Integer[] w = new Integer[21];
    int index = 0, indexW = 0;
    while (true) {
      int nr = scanner.nextInt();
      if (nr == 0) {
        break;
      }
      v[index] = nr;
      ++index;
    }
    int[] fr = new int[10];
    for (int i = 0; i < index; ++i) {
      boolean isValid = true;
      int number = v[i];
      while (number != 0) {
        if (number % 10 == 0) {
          isValid = false;
        }
        number /= 10;
      }
      if (isValid) {
        w[indexW] = v[i];
        ++indexW;
      }
    }
    for (int j = 0; j < indexW; ++j) {
      while (w[j] != 0) {
        ++fr[w[j] % 10];
        w[j] /= 10;
      }
    }
    int max = 7;
    int result = 0;
    for (int k = 0; k < 10; ++k) {
      if (fr[k] > 0) {
        if (fr[k] <= max) {
          max = fr[k];
          result = k;
        }
      }
    }
    System.out.println(result);
  }
}
