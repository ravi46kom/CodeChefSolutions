package com.codechef.Greedy_Algorithms_0_1000;

import java.util.Scanner;

public class Janmansh_at_Fruit_Market {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while (t-- > 0) {
				int x = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int min = Math.min(a, Math.min(c, b));
				int result = a + b + c - min;
				int min2 = Math.min(result - a, Math.min(result - c, result - b));
				System.out.println(min * (x - 1) + min2);
			}
		}
	}

}
