package com.codechef.math_0_1000;

import java.util.Scanner;

public class Tax_in_Chefland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			int res = x>100 ? (x-10) : x;
			System.out.println(res);
		}
	}

}
