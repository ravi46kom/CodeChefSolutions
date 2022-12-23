package com.codechef.math_0_1000;

import java.util.Scanner;

public class Maximum_Production {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int d = sc.nextInt();
			int x = sc.nextInt() * 7;
			int y = sc.nextInt();
			int z = sc.nextInt();
			System.out.println(Math.max(x, (d * y) + (7 - d) * z));
		}
	}

}
