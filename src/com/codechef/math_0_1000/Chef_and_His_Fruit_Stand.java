package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chef_and_His_Fruit_Stand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x >= 2 * y ? y : x/2);
		}
	}

}
