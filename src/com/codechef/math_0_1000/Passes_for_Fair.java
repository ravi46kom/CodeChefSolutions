package com.codechef.math_0_1000;

import java.util.Scanner;

public class Passes_for_Fair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(k > n ? "Yes" : "No");
		}
	}

}
