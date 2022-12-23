package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Programming_Languages {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int a1 = s.nextInt();
			int b1 = s.nextInt();
			int a2 = s.nextInt();
			int b2 = s.nextInt();
			int res = (a + b) == (a1 + b1) && (a == a1 || a == b1) ? 1
					: (a + b) == (a2 + b2) && (a == a2 || a == b2) ? 2 : 0;
			System.out.println(res);
		}
	}

}
