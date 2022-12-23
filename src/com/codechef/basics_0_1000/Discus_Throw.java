package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Discus_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if (A >= B && A >= C) {
				System.out.println(A);
			} else if (B >= C && B >= A) {
				System.out.println(B);
			} else {
				System.out.println(C);
			}
		}

	}

}
