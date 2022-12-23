package com.codechef.basics_0_1000;

import java.util.Scanner;

public class RCB_and_Playoffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			if ((X + (Z * 2)) >= Y) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
