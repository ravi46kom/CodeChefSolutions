package com.codechef.math_0_1000;

import java.util.Scanner;

public class Integers_that_sum_to_the_same_value {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int a = i;
			int b = n - i;
			if (a > 0 && b > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
