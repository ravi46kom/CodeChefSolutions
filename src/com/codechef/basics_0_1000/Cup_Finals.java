package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Cup_Finals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int D = sc.nextInt();
			if (Math.abs(X - Y) <= D) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
