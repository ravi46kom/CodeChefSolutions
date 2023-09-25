package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Three_Way_Communications {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int r = s.nextInt();
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			double d2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
			double d3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
			System.out.println((d1 <= r && d2 <= r) || (d3 <= r && d2 <= r) || (d1 <= r && d3 <= r) ? "yes" : "no");
		}

	}

}
