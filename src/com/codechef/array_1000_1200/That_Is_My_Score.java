package com.codechef.array_1000_1200;

import java.util.Scanner;

public class That_Is_My_Score {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[8];
			for (int i = 0; i < n; i++) {
				int k = s.nextInt();
				int val = s.nextInt();
				if (k <= 8) {
					arr[k - 1] = Math.max(val, arr[k - 1]);
				}
			}
			int sum = 0;
			for (int i = 0; i < 8; i++) {
				sum += arr[i];
			}
			System.out.println(sum);

		}
	}

}
