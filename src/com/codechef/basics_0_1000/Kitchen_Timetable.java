package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Kitchen_Timetable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			if (a[0] >= b[0]) {
				count++;
			}
			for (int i = 0; i < n; i++) {
				if (i > 0 && (a[i] - a[i - 1]) >= b[i]) {
					count++;
				}
			}
			System.out.println(count);

		}
	}

}
