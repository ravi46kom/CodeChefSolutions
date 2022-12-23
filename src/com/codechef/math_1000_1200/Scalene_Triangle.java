package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Scalene_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println(a == b || a == c || b == c ? "NO" : "YES");
		}
	}

}
