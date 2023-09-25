package com.codechef.sorting_1000_1200;

import java.util.Scanner;

public class A_Books {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) {
				int count = 0;
				for (int j = i + 1; j < n; j++) 
					if (a[i] < a[j])
						count++;
				
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}

}
