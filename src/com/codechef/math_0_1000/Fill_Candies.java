package com.codechef.math_0_1000;

import java.util.Scanner;

public class Fill_Candies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int count = 1;
			System.out.println(m*k >= n? 1:(n%(m*k) == 0?n/(m*k):(n/(m*k))+1));
		}
	}

}
