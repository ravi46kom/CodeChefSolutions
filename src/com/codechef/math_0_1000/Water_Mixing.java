package com.codechef.math_0_1000;

import java.util.Scanner;

public class Water_Mixing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			String res = ((a == b) || (a > b && (a - b <= y) || (a < b && b - a <= x))) ? "Yes" : "No";
			System.out.println(res);
		}
	}

}
