package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Sum_OR_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if (X > Y) {
			System.out.println(X - Y);
		} else {
			System.out.println(X + Y);
		}

	}

}
