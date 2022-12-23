package com.codechef.array_0_1000;

import java.util.Scanner;

public class Red_Light_Green_Light {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int count = 0;
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				if (h[i] > k) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
