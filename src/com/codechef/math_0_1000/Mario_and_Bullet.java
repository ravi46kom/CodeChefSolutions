package com.codechef.math_0_1000;

import java.util.Scanner;

public class Mario_and_Bullet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			System.out.println(z - (y / x) >= 0 ? z - (y / x) : 0);
		}
	}

}
