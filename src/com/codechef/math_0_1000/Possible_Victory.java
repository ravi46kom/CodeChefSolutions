package com.codechef.math_0_1000;

import java.util.Scanner;

public class Possible_Victory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int o = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(r >= (c + ((20 - o) * 6) * 6) ? "NO" : "YES");
	}

}
