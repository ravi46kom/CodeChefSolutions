package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Odd_Pairs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long n = s.nextLong();
			System.out.println(n * n / 2); 
		}
	}

}
