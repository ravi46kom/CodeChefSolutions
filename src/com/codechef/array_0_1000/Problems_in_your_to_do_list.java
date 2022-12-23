package com.codechef.array_0_1000;

import java.util.Scanner;

public class Problems_in_your_to_do_list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] d = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				d[i] = sc.nextInt();
				if (d[i] >= 1000) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
