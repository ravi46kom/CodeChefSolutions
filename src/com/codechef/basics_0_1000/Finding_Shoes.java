package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Finding_Shoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N < M) {
				System.out.println(N);
			} else if (M == 0) {
				System.out.println(N * 2);
			} else {
				System.out.println((N - M) + N);
			}

		}

	}

}
