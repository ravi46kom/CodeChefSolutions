package com.codechef.math_0_1000;

import java.util.Scanner;

public class Chef_and_Chocolates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(c>x) {
				System.out.println((c-x)*y);
			}else {
				System.out.println(0);
			}
		}
	}

}
