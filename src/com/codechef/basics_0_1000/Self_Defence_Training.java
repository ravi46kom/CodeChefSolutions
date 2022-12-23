package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Self_Defence_Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int count = 0;
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				if (A[i] >= 10 && A[i] <= 60) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
