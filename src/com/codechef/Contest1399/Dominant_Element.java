package com.codechef.Contest1399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dominant_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n];
			int max1 = 1;
			int max2 = 1;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for (int i = 0; i < n - 1;) {
				int count = 1;
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						count += 1;
					}
				}
				i += count;
				if(max1<=count) {
					max2 = max1;
					max1 = count;
				}
			}

			System.out.println(max1>max2? "YES" : "NO");

		}
	}

}
