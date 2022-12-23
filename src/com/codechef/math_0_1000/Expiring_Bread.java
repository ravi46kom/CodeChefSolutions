package com.codechef.math_0_1000;

import java.util.Scanner;

public class Expiring_Bread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			if ((m * k) < n) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

}
