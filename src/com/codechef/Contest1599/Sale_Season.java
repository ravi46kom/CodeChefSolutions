package com.codechef.Contest1599;

import java.util.Scanner;

public class Sale_Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			System.out.println(x <= 100 ? x : (x <= 1000 ? x - 25 : (x <= 5000 ? x - 100 : x - 500)));
		}
	}

}
