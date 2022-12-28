package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Prime_Generator {
	static boolean isprime(int val) {

		if (val <= 1)
			return false;
		if (val == 2)
			return true;
		if (val % 2 == 0)
			return false;

		int sqrt = (int) Math.sqrt(val);
		for (int i = 3; i <= sqrt; i++) {
			if (val % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int m = s.nextInt();
			int n = s.nextInt();

			for (int i = m; i <= n; i++) {
				if (isprime(i))
					System.out.println(i);
			}
		}
	}

}
