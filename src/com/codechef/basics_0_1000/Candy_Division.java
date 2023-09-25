package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Candy_Division {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int candies = s.nextInt();
			System.out.println(candies % 3 == 0 ? "YES" : "NO");
		}
	}

}
