package com.codechef.Contest1599;

import java.util.Scanner;

public class Gcd_of_Subarrays {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			while (t-- > 0) {
				int n = s.nextInt();
				int k = s.nextInt();
				long sum = (n * (n + 1) / 2) - 1;
				if (k < (n * (n - 1))) {
					System.out.println(-1);
				} else {
					for (int i = 0; i < n - 1; i++) {
						System.out.print(1 + " ");
					}
					System.out.println(k - sum);
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
