package com.codechef.math_0_1000;

import java.util.Scanner;

public class Fill_The_Grid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n % 2 !=0 && m % 2 != 0 && (n>1 || m>1) ?m+n-1:(n % 2 != 0 ? m : ((m % 2 == 0) ? 0 : n)));
		}
	}

}
