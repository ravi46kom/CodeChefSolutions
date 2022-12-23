package com.codechef.math_0_1000;

import java.util.Scanner;

public class Farmer_And_His_Plot {
	static int hcfEuclidiunMethod(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return hcfEuclidiunMethod(b % a, a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println((n / hcfEuclidiunMethod(n, m)) * m / hcfEuclidiunMethod(n, m));
		}
	}

}
