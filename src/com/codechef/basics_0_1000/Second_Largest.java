package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if (A > B && A < C || A > C && A < B) {
				System.out.println(A);
			} else if (B > A && B < C || B > C && B < A) {
				System.out.println(B);
			} else {
				System.out.println(C);
			}
		}

	}

}
