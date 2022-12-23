package com.codechef.math_0_1000;

import java.util.Scanner;

public class Minimum_Pizzas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int totalSlice = n * x;
			System.out.println((totalSlice % 4 == 0) ? totalSlice / 4 : (totalSlice / 4) + 1);
		}
	}

}
