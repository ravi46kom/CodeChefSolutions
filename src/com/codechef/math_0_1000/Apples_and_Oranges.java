package com.codechef.math_0_1000;

import java.util.Scanner;

public class Apples_and_Oranges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a + b) <= x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
