package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Favourite_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			String result = a % 2 == 0 && a % 7 == 0 ? "Alice" : a % 2 != 0 && a % 9 == 0 ? "Bob" : "Charlie";
			System.out.println(result);
		}
	}

}
