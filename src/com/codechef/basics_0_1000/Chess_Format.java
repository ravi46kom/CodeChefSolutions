package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chess_Format {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			if (sum < 3) {
				System.out.println(1);
			} else if (sum >= 3 && sum <= 10) {
				System.out.println(2);
			} else if (sum >= 11 && sum <= 60) {
				System.out.println(3);
			} else {
				System.out.println(4);
			}
		}

	}

}
