package week87;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    Map<String, Integer> freqSubs = new HashMap<>();
    String[] lines = new String[n + 1];
    for (int i = 1; i <= n; ++i) {
      lines[i] = scanner.nextLine();
      String[] words = lines[i].split(" ");
      String sub = words[0];
      freqSubs.put(sub, freqSubs.getOrDefault(sub, 0) + 1);
    }
    String res = "";
    for (int i = 1; i <= n; ++i) {
      String revLine = new StringBuilder(lines[i]).reverse().toString();
      System.out.println(revLine);
      for (int j = 1; j <= n; ++j) {
        if (i != j && revLine.compareTo(lines[i]) > 0) {
          res = lines[i];
          break;
        }
      }
    }
    System.out.println(res);
  }
}
