package week89;

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	if (a < b) {
		int aux = a;
		a = b;
		b = aux;
	}
    System.out.println(a - b - 1);
  }
}
