package com.codechef.math_0_1000;

import java.util.Scanner;

public class Car_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int p = sc.nextInt();
			int m = sc.nextInt();
			int v = sc.nextInt();
			System.out.println((m-(p-1))*v);
		}
	}

}
