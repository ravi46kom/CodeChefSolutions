package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Gold_Mining {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt() + 1;
			int x = sc.nextInt();
			int y = sc.nextInt();
			if ((y * n) >= x) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
