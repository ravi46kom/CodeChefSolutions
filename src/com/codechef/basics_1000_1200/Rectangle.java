package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			System.out.println((a == b && c == d) || (a == c && b == d) || (a == d && b == c) ? "YES" : "NO");
		}
	}

}
