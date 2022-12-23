package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Weight_Balance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int w1 = s.nextInt();
			int w2 = s.nextInt();
			int x1 = s.nextInt();
			int x2 = s.nextInt();
			int m = s.nextInt();
			System.out.println((w2 - w1) >= (x1 * m) && (w2 - w1) <= (x2 * m) ? 1 : 0);
		}
	}

}
