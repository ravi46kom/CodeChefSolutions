package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Miami_GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			double d = X*1.07;
			if (Y<=d) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
