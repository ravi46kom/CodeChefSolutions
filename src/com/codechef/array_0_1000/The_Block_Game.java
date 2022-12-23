package com.codechef.array_0_1000;

import java.util.Scanner;

public class The_Block_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int num = n;
			int rev = 0;
			while (num != 0) {
				rev = rev * 10 + (num % 10);
				num = num / 10;
			}
			if (rev == n) {
				System.out.println("wins");
			} else {
				System.out.println("loses");
			}

		}
	}

}
