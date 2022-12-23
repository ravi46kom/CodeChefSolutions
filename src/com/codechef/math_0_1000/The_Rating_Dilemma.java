package com.codechef.math_0_1000;

import java.util.Scanner;

public class The_Rating_Dilemma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int s = sc.nextInt();
			System.out.println(s == 0?-1:s>0?-(s+1):(s-1));
		}
	}

}
