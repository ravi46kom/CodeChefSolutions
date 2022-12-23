package com.codechef.math_0_1000;

import java.util.Scanner;

public class Smallest_Numbers_of_Notes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int rs = 0;
			rs += n / 100;
			n %= 100;
			rs += n / 50;
			n %= 50;
			rs += n / 10;
			n %= 10;
			rs += n / 5;
			n %= 5;
			rs += n / 2;
			n %= 2;
			if (n == 1) {
				rs++;
			}
			System.out.println(rs);

		}
	}

}
