package com.codechef.Contest1399;

import java.util.Scanner;

public class Nearest_Court {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int result = (x + y) / 2;
			if (result == x || result == y) {
				System.out.println(1);
			} else {
				System.out.println(Math.max(x, y) - result);
			}
		}
	}

}
