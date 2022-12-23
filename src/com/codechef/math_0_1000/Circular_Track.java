package com.codechef.math_0_1000;

import java.util.Scanner;

public class Circular_Track {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int m = sc.nextInt();
			int mid = m%2==0?m/2:(m/2)+1;
			System.out.println(mid >= b && b > a ? b - a
					: (mid <= b && b > a ? Math.min(m + a - b, b - a) : Math.min(m - a + b, a - b)));
		}
	}

}
