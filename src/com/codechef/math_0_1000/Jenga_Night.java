package com.codechef.math_0_1000;

import java.util.Scanner;

public class Jenga_Night {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			System.out.println(n <=x && x % n == 0 ? "Yes" : "No");
		}
	}

}
