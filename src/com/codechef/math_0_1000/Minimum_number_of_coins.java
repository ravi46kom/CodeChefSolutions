package com.codechef.math_0_1000;

import java.util.Scanner;

public class Minimum_number_of_coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			if (x >= 5 && (x%10==0 || x%5==0)) {
				
				int rem = x % 10;
				x = x / 10;
				if ( rem == 5) {
					System.out.println(x + 1);
				} else {
					System.out.println(x);
				}
			} else {
				System.out.println(-1);
			}
		}
	}

}
