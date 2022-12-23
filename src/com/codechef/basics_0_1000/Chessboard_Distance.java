package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chessboard_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int X1 = sc.nextInt();
			int X2 = sc.nextInt();
			int Y1 = sc.nextInt();
			int Y2 = sc.nextInt();

			if (Math.abs(X1 - Y1) > Math.abs(X2 - Y2)) {
				System.out.println(Math.abs(X1 - Y1));
			} else {
				System.out.println(Math.abs(X2 - Y2));
			}

		}

	}

}
