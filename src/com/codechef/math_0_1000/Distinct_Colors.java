package com.codechef.math_0_1000;

import java.util.Scanner;

public class Distinct_Colors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int size = s.nextInt();
			int[] A = new int[size];
			int max = 0;
			for (int i = 0; i < size; i++) {
				A[i] = s.nextInt();
				max = A[i] > max ? A[i] : max;
			}
			System.out.println(max);
		}
	}

}
