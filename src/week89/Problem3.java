package week89;

import java.util.Scanner;

public class Problem3 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    boolean exists = false;
    if (a.equals(b)) {
      System.out.println(a + b);
    } else if (!a.equals(b)) {
      int startIndex = a.indexOf(b);
      int lastIndex = 0;
      if (startIndex != -1) {
        exists = true;
      }
      if (exists) {
        ++startIndex;
        lastIndex = startIndex + b.length() - 1;
        System.out.println(startIndex + " " + lastIndex);
      } else {
        StringBuilder result = new StringBuilder();
        int min = Math.min(a.length(), b.length());
        for (int j = 0; j < min; ++j) {
          result.append(a.charAt(j)).append(b.charAt(j));
        }
        if (a.length() > min) {
          result.append(a.substring(min));
        } else if (b.length() > min) {
          result.append(b.substring(min));
        }
        System.out.println(result);
      }
    }
  }
}
