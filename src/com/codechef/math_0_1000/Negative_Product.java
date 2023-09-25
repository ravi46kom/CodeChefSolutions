package com.codechef.math_0_1000;

import java.util.List;
import java.util.Scanner;

public class Negative_Product {
	static List<Integer> solve(int k, List<Integer> ar) {
		int n = ar.size();
		int r = k;
		k = k % n;

		int i, j;
		// Reverse last k numbers
		for (i = n - k, j = n - 1; i < j; i++, j--) {
			int temp = ar.get(i);
			ar.add(i, ar.get(j));
			ar.add(j, temp);
		}
		// Reverse the first n-k terms
		for (i = 0, j = n - k - 1; i < j; i++, j--) {
			int temp = ar.get(i);
			ar.add(i, ar.get(j));
			ar.add(j, temp);
		}
		// Reverse the entire array
		for (i = 0, j = n - 1; i < j; i++, j--) {
			int temp = ar.get(i);
			ar.add(i, ar.get(j));
			ar.add(j, temp);
		}

		// Print the rotated array
		for (int t = 0; t < k; t++) {
			ar.add(t, 0);
		}
		return ar;
	}

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int t = s.nextInt();
//		while (t-- > 0) {
//			int x = s.nextInt();
//			int y = s.nextInt();
//			int z = s.nextInt();
//			System.out.println((x * y < 0 || x * z < 0 || y * z < 0) ? "YES" : "NO");
//		}
		
		
	}
}
