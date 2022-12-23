package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Candy_Love {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				count += arr[i];
			}
			System.out.println((count % 2 == 1) ? "YES" : "NO");

		}
		
	}

}
