package com.codechef.math_0_1000;

import java.util.Scanner;

public class Divisible_by_3 {
	static int Count(int a, int b, int count) {
		if (a % 3 == 0 || b % 3 == 0) {
			return count;
		} else {
			count++;
			return Count(Math.abs(a - b), Math.abs(a - b), count);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(Count(a, b, 0));
		}
	}

}
