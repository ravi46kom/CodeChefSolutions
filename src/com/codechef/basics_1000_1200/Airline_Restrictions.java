package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Airline_Restrictions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			int e = s.nextInt();
			int sum = a + b + c;
			String res = (a + b <= d && c <= e) || (a + c <= d && b <= e) || (b + c <= d && a <= e) ? "YES" : "NO";
			System.out.println(res);
		}
	}

}
