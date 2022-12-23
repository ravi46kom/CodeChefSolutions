package com.codechef.math_0_1000;

import java.util.Scanner;

public class Fill_the_Bucket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int k = sc.nextInt();
			int x = sc.nextInt();
			System.out.println(k - x);
		}
	}

}
