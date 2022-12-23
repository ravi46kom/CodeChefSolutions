package com.codechef.math_0_1000;

import java.util.Scanner;

public class Parity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			String res = (n % 2 == 0) ? "Yes" : "No";
			System.out.println(res);
		}
	}

}
