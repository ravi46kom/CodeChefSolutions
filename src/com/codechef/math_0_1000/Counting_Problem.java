package com.codechef.math_0_1000;

import java.util.Scanner;

public class Counting_Problem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int odd = 0;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				if (a[i] % 2 != 0)
					odd++;
			}
			String res = (odd % 2 == 0 && odd != 0) ? "YES" : "NO";
			System.out.println(res);
		}

	}

}
