package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chef_and_Remissness {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(Math.max(a, b)+" "+(a+b));
		}
	}

}
