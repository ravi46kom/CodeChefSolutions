package com.codechef.math_0_1000;

import java.util.Scanner;

public class Paper_Cutting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			int res = n / k;
			System.out.println(res * res);
		}
	}

}
