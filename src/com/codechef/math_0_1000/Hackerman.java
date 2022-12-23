package com.codechef.math_0_1000;

import java.util.Scanner;

public class Hackerman {
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 4; i < Math.sqrt(num); i++) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(isPrime(a + b) ? "Alice" : "Bob");
		}
	}

}
