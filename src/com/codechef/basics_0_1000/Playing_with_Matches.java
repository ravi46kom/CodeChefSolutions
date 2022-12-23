package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Playing_with_Matches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			int match_sum = 0;
			int n = sum;
			int count = 0;
			int x = 0;
			while (n != 0) {
				count++;
				n = n / 10;
			}
			for (int i = 0; i < count; i++) {
				x = sum % 10;
				sum = sum / 10;
				if (x == 1) {
					match_sum += 2;
				} else if (x == 6 || x == 9 || x == 0) {
					match_sum += 6;
				} else if (x == 2 || x == 5 || x == 3) {
					match_sum += 5;
				} else if (x == 4) {
					match_sum += 4;
				} else if (x == 7) {
					match_sum += 3;
				} else if (x == 8) {
					match_sum += 7;
				}
			}
			System.out.println(match_sum);
		}
	}
}
