package com.codechef.math_0_1000;

import java.util.Scanner;

public class Akash_and_Missing_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(n % 7 == 6 ? (n / 7) + 1 : n > 6 ? n / 7 : 0);
		}
	}

}
