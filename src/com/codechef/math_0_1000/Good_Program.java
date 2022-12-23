package com.codechef.math_0_1000;

import java.util.Scanner;

public class Good_Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			System.out.println(n%4 == 0 ? "Good":"Not Good");
		}
	}

}
