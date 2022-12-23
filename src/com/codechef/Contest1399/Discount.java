package com.codechef.Contest1399;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			double x = sc.nextInt();
			double per = 100-(100*(x/100));
			System.out.println(String.format("%.0f", per));
		}
	}

}
