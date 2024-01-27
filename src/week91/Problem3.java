package week91;

import java.util.*;

public class Problem3 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    Long sumKg = 0L;
    Long sumSaci = 0L;
    while (scanner.hasNextLine()) {
      Long number = 0L;
      String text = scanner.nextLine();
      if (text.contains("saci")) {
        for (int i = 0; i < text.length(); ++i) {
          if (isDigit(text.charAt(i))) {
            number = number * 10 + text.charAt(i) - '0';
          }
        }
        sumSaci += number;
        number = 0L;
      }
      if (text.contains("kilograme")) {
        for (int i = 0; i < text.length(); ++i) {
          if (isDigit(text.charAt(i))) {
            number = number * 10 + text.charAt(i) - '0';
          }
        }
      }
      sumKg += number;
      number = 0L;
    }
    System.out.println(sumSaci + " " + sumKg);
  }

  public static boolean isDigit(char ch) {
    return '0' <= ch && ch <= '9';
  }
}
