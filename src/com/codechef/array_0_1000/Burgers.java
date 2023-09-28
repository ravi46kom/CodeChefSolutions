package com.codechef.array_0_1000;

import java.util.Scanner;

public class Burgers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a > b ? b : a);
		}
	}

}
