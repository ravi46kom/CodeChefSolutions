package com.codechef.Contest1599;

import java.util.Scanner;

public class Air_Conditioner_Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (b >= a && b >= c) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
