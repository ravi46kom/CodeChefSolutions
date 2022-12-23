package com.codechef.math_0_1000;

import java.util.Scanner;

public class Fit_Squares_in_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int b = sc.nextInt();
			int n = (b/2)-1;
			System.out.println((n*(n+1))/2);
		}
	}

}
