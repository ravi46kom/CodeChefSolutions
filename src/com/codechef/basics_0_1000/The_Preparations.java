package com.codechef.basics_0_1000;

import java.util.Scanner;

public class The_Preparations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();
			if ((N * K) < M) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
