package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Food_Chain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long e = s.nextLong();
			long k = s.nextLong();
			int count = 0;
			do {
				e /= k;
				count++;
			} while (e != 0);	
			System.out.println(count);
		}
	}

}
