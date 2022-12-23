package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Chef_and_Stock_Prices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int s = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			double c = (double) sc.nextInt() / 100;
			double finalPrice = (s + (s * c));
			System.out.println(finalPrice >= a && finalPrice <= b ? "Yes" : "No");
		}
	}

}
