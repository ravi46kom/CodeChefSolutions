package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Economics_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int count = 0;
			int N = sc.nextInt();
			int[] S = new int[N];
			int[] D = new int[N];
			for (int i = 0; i < N; i++) {
				S[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				D[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				if (S[i] == D[i]) {
					count++;
				}
			}
			System.out.println(count);

		}

	}

}
