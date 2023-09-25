package com.codechef.sorting_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Uncle_Johny {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int k = s.nextInt();
			k = a[k-1];
			Arrays.sort(a);
			for (int i = 0; i < n; i++) {
				if (k == a[i]) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}

}
