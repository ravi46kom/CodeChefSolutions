package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Apples_and_oranges {
	static int equalDistribution(int a, int b) {
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a == b) {
			return a;
		}
		if(a>b) {
			return equalDistribution(a-b, b);
		}
		
		return equalDistribution(a, b-a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println(equalDistribution(n, m));
		}

	}

}
