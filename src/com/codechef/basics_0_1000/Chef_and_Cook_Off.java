package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_Cook_Off {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[5];
		while (n-- > 0) {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			if (sum < 1) {
				System.out.println("beginner");
			} else if (sum > 0 && sum < 2) {
				System.out.println("junior developer");
			} else if (sum > 1 && sum < 3) {
				System.out.println("middle developer");
			} else if (sum > 2 && sum < 4) {
				System.out.println("senior developer");
			} else if (sum > 3 && sum < 5) {
				System.out.println("hacker");
			}

			else if (sum == 5) {
				System.out.println("Jeff Dean");
			}
		}
	}

}
