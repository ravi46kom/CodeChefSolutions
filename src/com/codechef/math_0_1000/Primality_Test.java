package com.codechef.math_0_1000;

import java.util.Scanner;

public class Primality_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean b = false;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					b = true;
				}
			}
			System.out.println(b || n < 1?"no":"yes");
		}
	}

}
