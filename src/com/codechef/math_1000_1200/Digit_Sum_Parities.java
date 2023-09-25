package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Digit_Sum_Parities {
	static int digiSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int digitSum = digiSum(n);
			int res = 0;
			if (digitSum % 2 == 0) {
				do {
					n++;
					res = digiSum(n);
				}
				while (res % 2 == 0) ;
			} else {
				do {
					n++;
					res = digiSum(n);
				}
				while (res % 2 != 0) ;
			}
			System.out.println(n);
		}
	}

}
